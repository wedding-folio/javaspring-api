package io.weddingfolio.weddingfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "vendors")
public class Vendor
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;

  @ManyToOne
  @JoinColumn(name="postid",
        nullable = false)
  @JsonIgnoreProperties(value = "vendors", allowSetters = true)
  private UserPost userpost;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserPost getUserpost() {
    return userpost;
  }

  public void setUserpost(UserPost userpost) {
    this.userpost = userpost;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
