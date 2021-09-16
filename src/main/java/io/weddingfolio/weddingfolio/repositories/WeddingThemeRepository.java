package io.weddingfolio.weddingfolio.repositories;

import io.weddingfolio.weddingfolio.models.WeddingTheme;
import org.springframework.data.repository.CrudRepository;

public interface WeddingThemeRepository
    extends CrudRepository<WeddingTheme, Long> {
}
