package br.com.pucgo.perguntaai.models.DTO;

import br.com.pucgo.perguntaai.models.Topic;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

@Getter
public class TopicDto {
    private final Long id;
    private final String message;
    private final String title;
    private final LocalDateTime creationDate;


    public TopicDto(Topic topic) {
        this.id = topic.getId();
        this.message = topic.getMessage();
        this.title = topic.getTitle();
        this.creationDate = topic.getCreationDate();
    }

    public static Page<TopicDto> convert(Page<Topic> topics) {
        return topics.map(TopicDto::new);
    }
}
