package ma.sir.ocp.zynerator.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.sir.ocp.zynerator.security.bean.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
