package boot.repository;

import org.springframework.data.repository.CrudRepository;

import boot.entity.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long>  {

}
