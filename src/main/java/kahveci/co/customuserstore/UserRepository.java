package kahveci.co.customuserstore;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepository {
    final private Map<String, User> users = new ConcurrentHashMap<>();

    public User findUserByName(String username) {
        return users.get(username);
    }

    public void save(User user) {
        users.put(user.getUserName(), user);
    }
}
