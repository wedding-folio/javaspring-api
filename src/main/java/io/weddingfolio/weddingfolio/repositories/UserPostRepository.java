package io.weddingfolio.weddingfolio.repositories;

import io.weddingfolio.weddingfolio.models.UserPost;
import io.weddingfolio.weddingfolio.views.UserPostSlim;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserPostRepository
    extends CrudRepository<UserPost, Long>
{
    List<UserPostSlim> findAllBy();
    UserPostSlim findUserPostById(Long userid);
    List<UserPostSlim> findAllByUserId(Long userid);
}
