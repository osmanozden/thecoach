package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

import java.util.List;

@Data
public class TeamResource extends AbstractResource {

  private String teamIdentityName;

  private String name;

  private String description;

  private List<UserResource> members;

  private Long executiveUserId;
}
