package com.example.baton.domain.music.dto;

import com.example.baton.domain.music.entity.MusicEntity;
import com.example.baton.domain.user.entity.UserEntity;
import lombok.*;

@Data
@NoArgsConstructor
public class MusicRequestDto {

    private String musicName;
    private String imgUrl;
    private String musicUrl;
    private String writer;
    public MusicEntity toEntity(){
        return MusicEntity.builder()
                .musicName(musicName)
                .imgUrl(imgUrl)
                .musicUrl(musicUrl)
                .writer(writer)
                .build();
    }
}