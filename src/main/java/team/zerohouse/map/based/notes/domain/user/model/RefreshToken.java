package team.zerohouse.map.based.notes.domain.user.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class RefreshToken {
  
  @Id
  private UUID id;

  private LocalDateTime expired;

  private UUID accessTokenID;

  private LocalDateTime accessTokenExpired;

  private UUID userId;

}
