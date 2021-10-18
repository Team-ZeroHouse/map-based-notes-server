package team.zerohouse.map.based.notes.domain.user.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EmailDuplicateException extends RuntimeException {
  
  public EmailDuplicateException() {
    super("이메일이 중복됐습니다.");
  }

}
