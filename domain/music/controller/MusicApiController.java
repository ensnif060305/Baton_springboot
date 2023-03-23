package com.example.baton.domain.music.controller;

import com.example.baton.domain.music.dto.MusicRequestDto;
import com.example.baton.domain.music.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MusicApiController {

    private final MusicService musicService;
    @PostMapping("/api/music/register")
    public int test(@RequestBody MusicRequestDto musicRequestDto){
        musicService.join(musicRequestDto);
        return HttpStatus.OK.value();
    }
}
