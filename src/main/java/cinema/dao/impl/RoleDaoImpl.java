package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import cinema.model.Role.RoleName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> findByEmail = session.createQuery(
                    "FROM Role WHERE name = :name", Role.class);
            findByEmail.setParameter("name", roleName.name());
            return findByEmail.uniqueResult();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role:" + roleName, e);
        }
    }
}