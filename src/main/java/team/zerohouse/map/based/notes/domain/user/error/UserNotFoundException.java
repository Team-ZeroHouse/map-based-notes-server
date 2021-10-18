package team.zerohouse.map.based.notes.domain.user.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
  
  public UserNotFoundException() {
    super("이메일이나 비밀번호가 올바르지 않습니다.");
  }

}
