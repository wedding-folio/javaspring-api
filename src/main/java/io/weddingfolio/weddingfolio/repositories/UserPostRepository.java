package io.weddingfolio.weddingfolio.repositories;

import io.weddingfolio.weddingfolio.models.UserPost;
import io.weddingfolio.weddingfolio.views.UserPostDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserPostRepository
    extends CrudRepository<UserPost, Long>
{
    List<UserPostDto> findAllBy();
    UserPostDto findUserPostById(Long userid);
    List<UserPostDto> findAllByUserId(Long userid);
}
