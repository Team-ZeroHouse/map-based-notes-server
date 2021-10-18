package team.zerohouse.map.based.notes.domain.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import team.zerohouse.map.based.notes.domain.user.model.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<UUID, RefreshToken> {
  
}
