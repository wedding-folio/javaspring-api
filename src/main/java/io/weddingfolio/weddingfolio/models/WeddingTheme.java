package io.weddingfolio.weddingfolio.models;

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
  @OneToMany(mappedBy = "userpost",
  cascade = CascadeType.ALL,
  orphanRemoval = true)
  private List<UserPost> userPosts = new ArrayList<>();

  public WeddingTheme()
  {
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
}
