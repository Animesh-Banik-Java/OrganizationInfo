package com.organization.info.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String message;
    private boolean success;
}
