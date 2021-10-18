package team.zerohouse.map.based.notes.domain.user.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
  
  @Id
  private UUID id;

  private String email;

  private String hashedPassword;

  private String nickname;

}
