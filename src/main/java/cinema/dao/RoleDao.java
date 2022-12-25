package cinema.dao;

import cinema.model.Role;
import cinema.model.Role.RoleName;

public interface RoleDao {
    Role add(Role role);

    Role getByName(RoleName roleName);
}
