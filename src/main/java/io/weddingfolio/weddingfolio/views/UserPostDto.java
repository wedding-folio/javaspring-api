package io.weddingfolio.weddingfolio.views;

import org.springframework.beans.factory.annotation.Value;

public interface UserPostDto {
    Long getId();
    String getDescription();
    String getImageURL();

    @Value("#{target.city}, #{target.state}")
    String getLocation();

    @Value("#{target.user.id}")
    Long getUserId();

    @Value("#{target.user.firstName} #{target.user.lastName}")
    String getUserName();

    @Value("#{target.theme.weddingTheme}")
    String getWeddingTheme();

}
