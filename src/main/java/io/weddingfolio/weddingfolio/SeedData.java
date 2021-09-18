package io.weddingfolio.weddingfolio;

import io.weddingfolio.weddingfolio.models.UserPost;
import io.weddingfolio.weddingfolio.models.WeddingFolioUser;
import io.weddingfolio.weddingfolio.models.WeddingTheme;
import io.weddingfolio.weddingfolio.repositories.UserPostRepository;
import io.weddingfolio.weddingfolio.repositories.VendorRepository;
import io.weddingfolio.weddingfolio.repositories.WeddingFolioUserRepository;
import io.weddingfolio.weddingfolio.repositories.WeddingThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private WeddingFolioUserRepository _weddingFolioUsers;

    @Autowired
    private UserPostRepository _userPost;

    @Autowired
    private VendorRepository _vendor;

    @Autowired
    private WeddingThemeRepository _weddingTheme;

    @Override
    public void run(String... args) throws Exception
    {
        WeddingTheme theme1 = new WeddingTheme("Modern");
        _weddingTheme.save(theme1);

        WeddingTheme theme2 = new WeddingTheme("Rustic");
        _weddingTheme.save(theme2);

        WeddingTheme theme3 = new WeddingTheme("Luau");
        _weddingTheme.save(theme3);


        WeddingFolioUser user = new WeddingFolioUser();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("johndoe@gmail.com");
        user.setPassword("door");
        user.setCity("Austin");
        user.setState("TX");
        user.getUserPosts()
                .add(new UserPost(
                        "My Awesome Post!",
                        "Boston",
                        "MS",
                        "https://source.unsplash.com/random",
                        user,
                        theme1
                ));
        user.getUserPosts()
                        .add(new UserPost(
                                "My Second Rustic Getaway",
                                "Spokane",
                                "WS",
                                "https://source.unsplash.com/random",
                                user,
                                theme2
                        ));
        user.getUserPosts()
                        .add(new UserPost(
                                "To My New Ohana",
                                "Maui",
                                "HA",
                                "https://source.unsplash.com/random",
                                user,
                                theme3
                        ));
        _weddingFolioUsers.save(user);

        user = new WeddingFolioUser();
        user.setFirstName("Jane");
        user.setLastName("Robertson");
        user.setEmail("janerobertson@gmail.com");
        user.setPassword("test123");
        user.setCity("Boston");
        user.setState("MS");
        user.getUserPosts()
                .add(new UserPost(
                        "The Time Of Our Life",
                        "Boston",
                        "NJ",
                        "https://source.unsplash.com/random",
                        user,
                        theme2
                ));
        user.getUserPosts()
                .add(new UserPost(
                        "Rusty Times",
                        "Boston",
                        "NJ",
                        "https://source.unsplash.com/random",
                        user,
                        theme2
                ));
        user.getUserPosts()
                .add(new UserPost(
                        "Great Gatsby Ball",
                        "Rochester",
                        "NY",
                        "https://source.unsplash.com/random",
                        user,
                        theme1
                ));
        _weddingFolioUsers.save(user);
    }
}
