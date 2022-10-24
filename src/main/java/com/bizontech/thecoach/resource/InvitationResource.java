package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

@Data
public class InvitationResource extends AbstractResource {
  private String email;
  private Long teamId;
  private boolean isExist;
  private boolean isAccepted;
}
