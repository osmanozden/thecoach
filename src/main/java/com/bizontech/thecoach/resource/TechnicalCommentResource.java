package com.bizontech.thecoach.resource;

import com.codefirst.robin.base.resource.AbstractResource;
import lombok.Data;

@Data
public class TechnicalCommentResource extends AbstractResource {

    private String message;

    private UserResource sender;
}
