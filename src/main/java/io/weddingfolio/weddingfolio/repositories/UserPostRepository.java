package io.weddingfolio.weddingfolio.repositories;

import io.weddingfolio.weddingfolio.models.UserPost;
import org.springframework.data.repository.CrudRepository;

public interface UserPostRepository
    extends CrudRepository<UserPost, Long>
{
}
