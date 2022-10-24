package com.bizontech.thecoach.resource;

import com.codefirst.robin.model.StoredObject;
import lombok.Data;

@Data
public class ChatPersonRef {

    private StoredObject profilePicture;

    private String firstName;

    private String lastName;

    private Long userId;
}
