package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Favorite extends BaseEntity {

  @ManyToOne
  private User user;

  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name="user_company",
      joinColumns = @JoinColumn(name="favourite_id"),
      inverseJoinColumns=@JoinColumn(name="company_id"))
  private Set<Company> companies = new HashSet<>();

}
