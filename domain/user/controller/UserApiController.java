package com.example.baton.domain.user.controller;

import com.example.baton.domain.user.dto.UserPostRequestDto;
import com.example.baton.domain.user.entity.UserEntity;
import com.example.baton.domain.user.repository.UsersRepository;
import com.example.baton.domain.user.service.UserPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final UserPostService userPostService;

    @Autowired
    private final UsersRepository usersRepository;


    @PostMapping("/api/user")
    public int joinProc(@RequestBody UserPostRequestDto userPostRequestDto){
        userPostService.join(userPostRequestDto);
        return HttpStatus.OK.value();
    }


    @PostMapping("/api/emailCheck")
    public int checkEmail(@RequestBody UserEntity user) {
        String email = user.getEmail();
        if (usersRepository.findByEmail(email).isPresent()) {
            return HttpStatus.CONFLICT.value();
        } else {
            return HttpStatus.OK.value();
        }
    }
}