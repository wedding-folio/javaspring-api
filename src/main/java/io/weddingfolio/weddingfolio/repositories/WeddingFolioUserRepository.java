package io.weddingfolio.weddingfolio.repositories;

import io.weddingfolio.weddingfolio.models.WeddingFolioUser;
import org.springframework.data.repository.CrudRepository;

public interface WeddingFolioUserRepository
    extends CrudRepository<WeddingFolioUser, Long> {
}
