package com.bizontech.thecoach.model.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorDto {
  USER_NOT_FOUND(
      "AUTH-001",
      "User not found with given credentials",
      "Detailed message here",
      "http://robinhr.com/help/001");

  private final String errorCode;
  private final String message;
  private final String detailedMessage;
  private final String helpLink;

  ErrorDto(String errorCode, String message, String detailedMessage, String helpLink) {
    this.errorCode = errorCode;
    this.message = message;
    this.detailedMessage = detailedMessage;
    this.helpLink = helpLink;
  }
}
