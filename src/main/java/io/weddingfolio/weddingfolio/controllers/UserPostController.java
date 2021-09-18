package io.weddingfolio.weddingfolio.controllers;

import io.weddingfolio.weddingfolio.models.UserPost;
import io.weddingfolio.weddingfolio.repositories.UserPostRepository;
import io.weddingfolio.weddingfolio.views.UserPostData;
import io.weddingfolio.weddingfolio.views.UserPostSlim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userposts")
public class UserPostController {
    @Autowired
    private UserPostRepository _userPostRepo;

    @GetMapping(value="/getAllPosts", produces = "application/json")
    public ResponseEntity<?> getAllUserPosts(){
        List<UserPostSlim> p =  _userPostRepo.findAllBy();
        Object response = new Object(){
            public final List<UserPostSlim> userPosts = p;
        };
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/getAllUserPosts/{userId}/{postId}", produces = "application/json")
    public ResponseEntity<?> getUserPostData(@PathVariable Long postId, @PathVariable Long userId)
    {
        UserPostSlim p = _userPostRepo.findUserPostById(postId);
        List<UserPostSlim> up = _userPostRepo.findAllByUserId(userId);
        UserPostData response = new UserPostData(p, up);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    @GetMapping(value = "/getAllUserPosts/{userId}", produces = "application/json")
//    public ResponseEntity<?> getAllUserPostsById(@PathVariable Long userId)
//    {
//        List<UserPostSlim> p = _userPostRepo.findAllByUserId(userId);
//        Object response = new Object() {
//            public final List<UserPostSlim> userPosts = p;
//        };
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
}
