package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import com.codefirst.robin.dto.MessageDto;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ChatResource extends AbstractResource {

    private String fromName;

    private Long fromId;

    private String fromEmail;

    private Long destinationId;

    private String destinationEmail;

    private String destinationName;

    private String avatar;

    private LocalDate time;

    private List<MessageDto> messages;
}
