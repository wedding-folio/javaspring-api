package io.weddingfolio.weddingfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="weddingfoliousers")
public class WeddingFolioUser
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private String city;
  private String state;

  @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
  @JsonIgnoreProperties(value = "user", allowSetters = true)
  private List<UserPost> userPosts = new ArrayList<>();

  // constructor for JPA
  public WeddingFolioUser()
  {
  }

  public WeddingFolioUser(String password, String firstName, String lastName, String email, String city, String state) {
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.city = city;
    this.state = state;
  }

  public long getId() {
    return id;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getState()
  {
    return state;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  public List<UserPost> getUserPosts() {
    return userPosts;
  }

  public void setUserPosts(List<UserPost> userPosts) {
    this.userPosts = userPosts;
  }

  public void setId(long id) {
    this.id = id;
  }
}
