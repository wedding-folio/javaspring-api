package io.weddingfolio.weddingfolio.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userpost")
public class UserPost
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String description;
  private String city;
  private String state;
  private String imageURL;
  private Long userId;
  private Long themeId;

  @OneToMany(mappedBy = "vendors",
  cascade = CascadeType.ALL,
  orphanRemoval = true)
  private List<Vendor> vendors = new ArrayList<>();

  public UserPost()
  {

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

  public Long getUserId()
  {
    return userId;
  }

  public void setUserId(Long userId)
  {
    this.userId = userId;
  }

  public Long getThemeId()
  {
    return themeId;
  }

  public void setThemeId(Long themeId)
  {
    this.themeId = themeId;
  }
}
