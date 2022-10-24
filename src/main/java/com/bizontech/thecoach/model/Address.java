package com.bizontech.thecoach.model;

import com.codefirst.robin.base.data.entity.BaseEntity;
import com.codefirst.robin.types.AddressType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "address")
public class Address extends BaseEntity {

  @Column private String city;
  @Column private String country;
  @Column private String countryCode;
  @Column private String extendedAddress;
  @Column private String formattedType;
  @Column private String formattedValue;
  @Column private String poBox;
  @Column private String postalCode;
  @Column private String region;
  @Column private String streetAddress;
  @Column private String type;

  @Column(name = "address_type")
  @Enumerated
  private AddressType addressType;

  @ManyToOne private User user;

  public Address() {}
}
