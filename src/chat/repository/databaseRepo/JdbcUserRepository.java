package chat.repository.databaseRepo;

import chat.model.User;
import chat.repository.UserRepository;

import java.util.List;

public class JdbcUserRepository implements UserRepository {

    //Repo Implementierung mit Datenbanken
    @Override
    public void add(User user) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void update(String s, User user) {

    }

    @Override
    public User findbyId(String s) {
        return null;
    }

    @Override
    public List<User> getAllOnlinefriends() {
        return null;
    }
}
