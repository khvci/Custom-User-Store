package kahveci.co.customuserstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    UserRepository userRepo;

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.addUser(user);
    }
}
