package com.bizontech.thecoach.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class GenericResource<DATA> {
  private int resultCode = 200;
  private String result = "OK";
  private String errorMessage = "Success";

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private DATA data;

  public GenericResource(DATA data) {
    this.data = data;
  }

  public GenericResource() {}

  public static GenericResource ok() {
    return new GenericResource();
  }
}
