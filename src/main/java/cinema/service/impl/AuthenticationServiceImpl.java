package cinema.service.impl;

import cinema.model.Role.RoleName;
import cinema.model.User;
import cinema.service.AuthenticationService;
import cinema.service.RoleService;
import cinema.service.ShoppingCartService;
import cinema.service.UserService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final RoleName DEFAULT_ROLE = RoleName.USER;
    private final RoleService roleService;
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;

    public AuthenticationServiceImpl(RoleService roleService, UserService userService,
            ShoppingCartService shoppingCartService) {
        this.roleService = roleService;
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(DEFAULT_ROLE)));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
