package chat.repository.memoryRepo;

import chat.model.User;
import chat.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {

    public List<User> getAllUsers() {
        return allUsers;
    }

    private List<User> allUsers;

    public InMemoryUserRepository() {
        this.allUsers = new ArrayList<>();
        this.populateUsers();
    }

    private void populateUsers(){
        User user1 = new User("ion", "1234", false);
        User user2 = new User("maria", "12345", true);
        User user3 = new User("popescu", "1234", false);

        user1.addFriend(user2);
        user2.addFriend(user3);

        //verwende unsere eigene add Methode
        add(user1);
        add(user2);
        add(user3);
    }

    @Override
    public void add(User user) {
        for (User u: this.allUsers){
            if(u.getUsername().equals(user.getUsername())){
                System.out.println("Username already exists");
                return;
            }
        }
        this.allUsers.add(user);

    }

    @Override
    public void delete(String username) {
        User user = this.findbyId(username);
        allUsers.remove(user);
    }

    @Override
    public void update(String s, User user) {

    }

    @Override
    public User findbyId(String username) {
        for(User u: this.allUsers){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllOnlinefriends() {
        return null;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = findbyId(username);
        if(user == null){
            return null;
        }
        else{
            if(user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
