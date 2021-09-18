package io.weddingfolio.weddingfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userposts")
public class UserPost
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String description;
  private String city;
  private String state;
  private String imageURL;
  @ManyToOne
  @JoinColumn(name = "userid",
          nullable = false)
  @JsonIgnoreProperties(value = "userPosts", allowSetters = true)
  private WeddingFolioUser user;

  @ManyToOne
  @JoinColumn(name = "themeid",
          nullable = false)
  @JsonIgnoreProperties(value = "userPosts", allowSetters = true)
  private WeddingTheme theme;

  @OneToMany(mappedBy = "userpost",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
  @JsonIgnoreProperties(value = "userpost", allowSetters = true)
  private List<Vendor> vendors = new ArrayList<>();

  public UserPost()
  {

  }

  public UserPost(String description, String city, String state, String imageURL, WeddingFolioUser user, WeddingTheme theme) {
    this.description = description;
    this.city = city;
    this.state = state;
    this.imageURL = imageURL;
    this.user = user;
    this.theme = theme;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
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

  public String getImageURL()
  {
    return imageURL;
  }

  public void setImageURL(String imageURL)
  {
    this.imageURL = imageURL;
  }

  public void setUser(WeddingFolioUser user) {
    this.user = user;
  }

  public WeddingFolioUser getUser() {
    return user;
  }

  public void setTheme(WeddingTheme theme) {
    this.theme = theme;
  }

  public WeddingTheme getTheme() {
    return theme;
  }

  public List<Vendor> getVendors() {
    return vendors;
  }

  public void setVendors(List<Vendor> vendors) {
    this.vendors = vendors;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
