package edu.java.bot.client;

import edu.java.api.TgChatApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
@Component
public class TgChatClient implements TgChatApi {
    private static final String DEFAULT_URL = "http://localhost:8080/tg-chat";
    public static final String ID = "/{id}";

    private final WebClient webClient;

    public TgChatClient() {
        this.webClient = WebClient.builder().baseUrl(DEFAULT_URL).build();
    }

    public TgChatClient(String baseUrl) {
        this.webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    @Override
    public ResponseEntity<Void> tgChatIdDelete(Long id) {
        return webClient.delete()
                .uri(uriBuilder -> uriBuilder.path(ID).build(id))
                .retrieve()
                .toEntity(Void.class)
                .onErrorResume(WebClientResponseException.class, Mono::error)
                .block();
    }

    @Override
    public ResponseEntity<Void> tgChatIdPost(Long id) {
        return webClient.post()
                .uri(uriBuilder -> uriBuilder.path(ID).build(id))
                .retrieve()
                .toEntity(Void.class)
                .onErrorResume(WebClientResponseException.class, Mono::error)
                .block();
    }
}
