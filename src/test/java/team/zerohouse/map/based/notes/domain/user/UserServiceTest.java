package team.zerohouse.map.based.notes.domain.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import team.zerohouse.map.based.notes.domain.user.dto.SignInDTO;
import team.zerohouse.map.based.notes.domain.user.dto.SignUpDTO;
import team.zerohouse.map.based.notes.domain.user.model.User;
import team.zerohouse.map.based.notes.domain.user.repository.RefreshTokenRepository;
import team.zerohouse.map.based.notes.domain.user.repository.UserRepository;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {

  @Autowired
  private UserService service;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RefreshTokenRepository refreshTokenRepository;

  @BeforeEach
  public void beforeEach() {
    this.userRepository.deleteAll();
    this.refreshTokenRepository.deleteAll();
  }

  @Test
  public void 회원가입_성공_테스트() {
    final String email = "test@example.com";

    final SignUpDTO signUpDto = new SignUpDTO();
    signUpDto.setEmail("test@example.com");
    signUpDto.setPassword("abcd1234");
    signUpDto.setPasswordCheck("abcd1234");
    signUpDto.setNickname("test");

    this.service.signUp(signUpDto);

    this.userRepository.findByEmail("test");
  }

  @Test
  public void 회원가입_이메일_중복_테스트() {
    User user = User.builder()
                    .email("email@to2.kr")
                    .nickname("test")
                    .hashedPassword("password")
                    .build();

  }

  @Test
  public void 로그인_성공_테스트() {

  }

  @Test
  public void 로그인_아이디_없음_테스트() {

  }

  @Test
  public void 로그인_비밀번호_틀림_테스트() {

  }

  @Test
  public void 로그아웃_테스트() {
    
  }
  
}
