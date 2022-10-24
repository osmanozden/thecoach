package com.bizontech.thecoach.resource;

import lombok.Data;

@Data
public class MailResource {
  String email;

  String subject;

  String text;
}
