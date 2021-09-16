package io.weddingfolio.weddingfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "vendors")
public class Vendor
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private long postId;
}
