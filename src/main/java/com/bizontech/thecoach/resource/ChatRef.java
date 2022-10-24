package com.bizontech.thecoach.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatRef{

    private Long chatId;

    private ChatPersonRef otherPerson;

    private String lastMessage;

}
