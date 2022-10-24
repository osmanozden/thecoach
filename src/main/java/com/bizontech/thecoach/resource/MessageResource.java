package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

@Data
public class MessageResource extends AbstractResource {

    private String avatar;

    private String text;

    private String from;

    private String time;

    private String messageType;

    private boolean viewed;
}
