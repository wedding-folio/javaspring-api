package io.weddingfolio.weddingfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "weddingthemes")
public class WeddingTheme
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String weddingTheme;

  @OneToMany(mappedBy = "theme",
          cascade = CascadeType.ALL,
          orphanRemoval = true)
  @JsonIgnoreProperties(value = "theme", allowSetters = true)
  private List<UserPost> userPosts = new ArrayList<>();

  public WeddingTheme()
  {
  }

  public WeddingTheme(String weddingTheme){
    this.weddingTheme = weddingTheme;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getWeddingTheme()
  {
    return weddingTheme;
  }

  public void setWeddingTheme(String weddingTheme)
  {
    this.weddingTheme = weddingTheme;
  }

  public List<UserPost> getUserPosts() {
    return userPosts;
  }

  public void setUserPosts(List<UserPost> userPosts) {
    this.userPosts = userPosts;
  }
}
