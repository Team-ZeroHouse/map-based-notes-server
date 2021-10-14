package team.zerohouse.map.based.notes.domain.user.dto;

import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Validated
public class SignUpDTO {

  private String uuid;
  
  @NotBlank
  private String email;

  @NotBlank
  private String password;

  @NotBlank
  private String passwordCheck;

  @NotBlank
  private String nickname;

}
