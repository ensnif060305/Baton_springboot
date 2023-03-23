package com.example.baton.domain.music.service;

import com.example.baton.domain.music.dto.MusicRequestDto;
import com.example.baton.domain.music.repository.MusicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final MusicRepository musicRepository;

    @Transactional
    public void join(MusicRequestDto musicRequestDto) {
        musicRepository.save(musicRequestDto.toEntity());
    }
}