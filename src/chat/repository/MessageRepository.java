package chat.repository;

import chat.model.Message;

public interface MessageRepository extends ICrudRepository<Integer, Message> {

    //additional methods (besides CRUD) for handling the data about messages
}
