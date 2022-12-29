package security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.demo.user.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
