package edu.java.service.jooq;

import edu.java.repository.jooq.JooqTgChatRepository;
import edu.java.service.abstractImplementation.AbstractTgChatService;


public class JooqTgChatService extends AbstractTgChatService {

    public JooqTgChatService(JooqTgChatRepository tgChatRepository) {
        super(tgChatRepository);
    }
}
