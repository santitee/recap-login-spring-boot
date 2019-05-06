package boot.repository;

import org.springframework.data.repository.CrudRepository;

import boot.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Long>  {
   AppUser findByUserName(String userName);
}
