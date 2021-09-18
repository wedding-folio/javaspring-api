package io.weddingfolio.weddingfolio.views;

import java.util.List;

public class UserPostData {
    public UserPostDto post;
    public List<UserPostDto> userPost;

    public UserPostData(UserPostDto post, List<UserPostDto> userPost) {        this.post = post;
        this.userPost = userPost;
    }
}
