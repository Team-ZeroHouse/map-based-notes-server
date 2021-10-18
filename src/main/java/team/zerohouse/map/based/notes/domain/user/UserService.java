package team.zerohouse.map.based.notes.domain.user;

import java.util.UUID;

import team.zerohouse.map.based.notes.domain.user.dto.JWTsDTO;
import team.zerohouse.map.based.notes.domain.user.dto.SignInDTO;
import team.zerohouse.map.based.notes.domain.user.dto.SignUpDTO;
import team.zerohouse.map.based.notes.domain.user.error.EmailDuplicateException;
import team.zerohouse.map.based.notes.domain.user.error.UserNotFoundException;

public interface UserService {
  
  /**
   * 회원가입을 한다.
   * 
   * @param signUpDto
   * @throws EmailDuplicateException
   */
  void signUp(SignUpDTO signUpDto) throws EmailDuplicateException;

  /**
   * 사용자를 로그인 시키고 JWTsDTO를 반환받는다.
   * @param signInDto
   * @return access 토큰과 refresh 토큰을 가지고 있는 객체
   * @throws UserNotFoundException
   */
  JWTsDTO signIn(SignInDTO signInDto) throws UserNotFoundException;

  /**
   * refresh token id를 받아서 만료시킨다.
   * 
   * @param refreshTokenId
   */
  void signOut(UUID refreshTokenId);

}
