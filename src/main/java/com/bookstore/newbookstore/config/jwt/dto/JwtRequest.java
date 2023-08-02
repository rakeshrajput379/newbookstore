package com.bookstore.newbookstore.config.jwt.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class JwtRequest {
    private String email;
    private String password;

}
