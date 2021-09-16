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
        WeddingFolioUser user1 = new WeddingFolioUser();
        user1.setFirstName("Jimmy");
        user1.setLastName("Doe");
        user1.setEmail("jimmydoe@gmail.com");
        user1.setPassword("test123");
        _weddingFolioUsers.save(user1);

        WeddingTheme theme = new WeddingTheme();
        theme.setWeddingTheme("Modern");
        _weddingTheme.save(theme);

        UserPost post = new UserPost();
        post.setDescription("My awesome post!");
        post.setCity("New York");
        post.setState("NY");
        post.setUserId(user1.getId());
        post.setThemeId(theme.getId());
        user1.getUserPosts()
                .add(post);
        _weddingFolioUsers.save(user1);
    }
}
