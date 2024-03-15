package edu.java.repository.interf;

import edu.java.repository.entity.ChatEntity;
import java.util.List;
import java.util.Optional;

public interface TgChatRepository {
    long add(long tgChatId);

    long remove(long tgChatId);

    List<ChatEntity> findAll();

    Optional<ChatEntity> findByTgId(long chatTgId);
}
