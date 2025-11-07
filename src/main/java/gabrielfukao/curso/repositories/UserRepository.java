package gabrielfukao.curso.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import gabrielfukao.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}