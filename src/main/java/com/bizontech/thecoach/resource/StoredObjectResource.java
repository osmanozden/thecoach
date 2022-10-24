package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

@Data
public class StoredObjectResource extends AbstractResource {
  public String uid;
  public String name;
  public String fileName;
  public String storageType;
}
