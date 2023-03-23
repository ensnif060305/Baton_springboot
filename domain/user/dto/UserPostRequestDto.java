package com.example.baton.domain.user.dto;

import com.example.baton.domain.user.entity.UserEntity;
import lombok.*;

@Data
@NoArgsConstructor
public class UserPostRequestDto {
    private String username;
    private String password;
    private String email;
    private String nickname;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .username(username)
                .password(password)
                .email(email)
                .nickname(nickname)
                .build();
    }
}