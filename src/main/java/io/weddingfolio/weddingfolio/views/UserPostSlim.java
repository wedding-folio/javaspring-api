package io.weddingfolio.weddingfolio.views;

public interface UserPostSlim {
    Long getId();
    String getDescription();
    String getCity();
    String getState();
    String getImageURL();
    WeddingFolioUser getUser();
    WeddingTheme getTheme();

    interface WeddingFolioUser {
        Long getId();
        String getFirstName();
    }
    interface WeddingTheme {
        String getWeddingTheme();
    }
}
