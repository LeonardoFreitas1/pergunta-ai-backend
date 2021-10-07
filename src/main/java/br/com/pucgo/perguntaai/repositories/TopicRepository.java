package br.com.pucgo.perguntaai.repositories;

import br.com.pucgo.perguntaai.models.Topic;
import br.com.pucgo.perguntaai.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    Page<Topic> findByStatus(String status, Pageable pagination);
    Page<Topic> findByAuthor(User user, Pageable pagination);
}
