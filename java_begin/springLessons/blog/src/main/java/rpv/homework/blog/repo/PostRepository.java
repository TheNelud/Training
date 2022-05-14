package rpv.homework.blog.repo;

import org.springframework.data.repository.CrudRepository;
import rpv.homework.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
