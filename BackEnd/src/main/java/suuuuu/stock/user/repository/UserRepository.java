package suuuuu.stock.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suuuuu.stock.user.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByUserId (String userId);
    Optional<UserEntity> findByUserId(String userId);
}
