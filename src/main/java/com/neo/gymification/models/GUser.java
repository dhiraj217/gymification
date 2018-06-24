package com.neo.gymification.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class GUser {

  @Id
  @NotBlank
  private String userName;

  @NotBlank
  private String password;

  private String name;

  @NotBlank
  @Column(unique = true)
  private String hwAddress;

  private Long points = (long)250;

 /*@OneToMany
 private List<Activity> userActivities;*/
}