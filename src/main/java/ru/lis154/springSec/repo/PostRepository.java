package ru.lis154.springSec.repo;

import org.springframework.data.repository.CrudRepository;
import ru.lis154.springSec.model.Post;

public interface PostRepository extends CrudRepository <Post, Long> {
}
