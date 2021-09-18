package io.weddingfolio.weddingfolio.views;

import java.util.List;

public class UserPostData {
    public UserPostSlim post;
    public List<UserPostSlim> userPost;

    public UserPostData(UserPostSlim post, List<UserPostSlim> userPost) {
        this.post = post;
        this.userPost = userPost;
    }
}
