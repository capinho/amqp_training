package fr.lernejo.chat;

import org.springframework.stereotype.Component;


@Component
public class ChatMessageListener {
    private final ChatMessageRepository repository;

    public ChatMessageListener(ChatMessageRepository repository) {
        this.repository = repository;
    }

    public void onMessage(String message) {
        //System.out.println(message);
        repository.addChatMessage(message);

    }

}
