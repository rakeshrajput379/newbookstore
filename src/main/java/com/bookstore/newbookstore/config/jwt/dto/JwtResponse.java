package com.bookstore.newbookstore.config.jwt.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class JwtResponse {

    private String jwtToken;
    private String username;
}
