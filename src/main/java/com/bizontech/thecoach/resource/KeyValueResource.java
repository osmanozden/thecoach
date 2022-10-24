package com.bizontech.thecoach.resource;

import lombok.Data;

@Data
public class KeyValueResource {
  private String key;
  private Object value;

  public KeyValueResource(String key, Object value) {
    this.key = key;
    this.value = value;
  }
}
