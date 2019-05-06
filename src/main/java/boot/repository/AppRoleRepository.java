package boot.repository;

import org.springframework.data.repository.CrudRepository;

import boot.entity.AppRole;

public interface AppRoleRepository extends CrudRepository<AppRole, Long>  {
   AppRole findByRoleName(String roleName);
}
