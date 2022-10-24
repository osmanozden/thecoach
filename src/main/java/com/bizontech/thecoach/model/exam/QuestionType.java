package com.bizontech.thecoach.model.exam;

public enum QuestionType {
  YES_NO(1, "YES OR NO QUESTION"),
  OPTIONAL(2, "ONLY ONE OPTION HAS TO BE SELECTED VIA TOO MANY OPTIONS"),
  MULTI_CHOICE(3, "USER CAN SELECT ONE OR MULTIPLE CORRECT SELECTION VIA MULTIPLE OPTIONS"),
  FREE_TEXT(4, "ANY TEXT ENABLED QUESTIONS; NEEDS LARGE TEXT AREA");

  private final int code;
  private final String description;

  QuestionType(int code, String description) {
    this.code = code;
    this.description = description;
  }

  public int getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }
}
