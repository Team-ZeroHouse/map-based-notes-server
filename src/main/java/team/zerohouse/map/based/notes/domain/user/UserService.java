package team.zerohouse.map.based.notes.domain.user;

import team.zerohouse.map.based.notes.domain.user.dto.SignInDTO;
import team.zerohouse.map.based.notes.domain.user.dto.SignUpDTO;
import team.zerohouse.map.based.notes.domain.user.error.EmailDuplicateException;
import team.zerohouse.map.based.notes.domain.user.error.UserNotFoundException;

public interface UserService {
  
  void signUp(SignUpDTO signUpDto) throws EmailDuplicateException;

  void signIn(SignInDTO signInDto) throws UserNotFoundException;

}
