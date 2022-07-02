package kahveci.co.customuserstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    UserRepository userRepo;
    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/register")
    public void register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
    }
}
