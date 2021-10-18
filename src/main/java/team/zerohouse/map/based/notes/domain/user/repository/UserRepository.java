package team.zerohouse.map.based.notes.domain.user.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import team.zerohouse.map.based.notes.domain.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<UUID, User> {
  
  Optional<User> findByEmail(String email);

}
