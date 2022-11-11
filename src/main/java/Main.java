import chat.model.Message;
import chat.model.User;
import chat.repository.MessageRepository;
import chat.repository.UserRepository;
import chat.repository.memoryRepo.InMemoryMessageRepository;
import chat.repository.memoryRepo.InMemoryUserRepository;
import chat.service.Server;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!!!!");

        UserRepository userRepository = new InMemoryUserRepository();
        MessageRepository messageRepository = new InMemoryMessageRepository(userRepository);

        Server server = new Server(userRepository, messageRepository);
        User user1 = userRepository.findbyId("ion");
        User user2 = userRepository.findbyId("maria");

        server.login("ion", "1234");
        server.login("maria", "12345");
        String result = server.sendMessage(new Message(user1, user2, "Salut", 100));
        System.out.println(result);
    }
}