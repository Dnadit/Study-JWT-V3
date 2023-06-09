package dnadit.studyJWTv3.controller;

import dnadit.studyJWTv3.domain.LoginReqeust;
import dnadit.studyJWTv3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginReqeust dto) {
        return ResponseEntity.ok().body(userService.login(dto.getUserName(), ""));
    }
}
