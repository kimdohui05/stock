package suuuuu.stock.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suuuuu.stock.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
