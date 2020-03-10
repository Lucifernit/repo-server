package com.kodekonveyor.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodekonveyor.annotations.ExcludeFromCodeCoverage;
import com.kodekonveyor.webapp.UrlMapConstants;

@RestController
@ExcludeFromCodeCoverage("framework")
public class ShowUserController {

  @Autowired
  AuthenticatedUserService authenticatedUserService;

  @Autowired
  UserEntityRepository marketUserEntityRepository;

  @GetMapping(UrlMapConstants.SHOW_USER_PATH)
  public UserDTO call() {
    final UserEntity userEntity = authenticatedUserService.call();
    final UserDTO userDTO = new UserDTO();
    userDTO.setId(userEntity.getId());
    userDTO.setLogin(userEntity.getLogin());
    return userDTO;
  }

}
