package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.types.AddressType;
import lombok.Data;

@Data
public class AddressResource extends AbstractResource {

  private String city;
  private String country;
  private String countryCode;
  private String extendedAddress;
  private String formattedType;
  private String formattedValue;
  private String poBox;
  private String postalCode;
  private String region;
  private String streetAddress;
  private String type;
  private AddressType addressType;
}
