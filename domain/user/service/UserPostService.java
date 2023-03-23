package com.example.baton.domain.user.service;

import com.example.baton.domain.user.dto.UserPostRequestDto;
import com.example.baton.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserPostService {

    private final UserRepository userRepository;
    @Transactional
    public void join(UserPostRequestDto userPostRequestDto) {
        userRepository.save(userPostRequestDto.toEntity());
    }
}