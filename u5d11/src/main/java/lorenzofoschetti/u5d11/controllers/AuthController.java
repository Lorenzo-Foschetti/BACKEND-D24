package lorenzofoschetti.u5d11.controllers;


import lorenzofoschetti.u5d11.payloads.UserLoginPayload;
import lorenzofoschetti.u5d11.payloads.UserLoginResponsePayload;
import lorenzofoschetti.u5d11.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public UserLoginResponsePayload login(@RequestBody UserLoginPayload payload) {
        return new UserLoginResponsePayload(authService.authenticateUserAndGenerateToken(payload));
    }
}
