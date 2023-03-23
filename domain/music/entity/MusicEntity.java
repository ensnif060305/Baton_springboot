package com.example.baton.domain.music.entity;

import com.example.baton.domain.user.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class MusicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String musicName;
    @Column(nullable = false)
    private String imgUrl;
    @Column(nullable = false)
    private String musicUrl;
    @Column
    private String writer;
}