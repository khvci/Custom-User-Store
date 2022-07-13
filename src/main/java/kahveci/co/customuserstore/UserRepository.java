package kahveci.co.customuserstore;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepository {
    final  private Map<String, User> users = new ConcurrentHashMap<>();

    public User findUserByUsername(String userName) {
        return users.get(userName);
    }

    public void addUser(User user) {
        this.users.put(user.getUserName(), user);
    }
}
