package com.min38.smilegraph.Entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/*
    @Entity: 테이블과 링크될 클래스
    @Id: PK
    @NoArgsConstructor: 기본 생성자 자동 추가
*/
@Entity(name = "DIARY_TB")
@Getter
@Setter
@NoArgsConstructor
public class Diary {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID", nullable = false)
    private long userid; // 작성자 PK

    @Column(name = "TITLE", nullable = false)
    private String title; // 일기 제목

    @Column(name = "CONTENT", nullable = false)
    private String content; // 일기 본문

    @Column(name = "HAPPINESS", nullable = false)
    private int happiness; // 행복도

    @Column(name = "EMOJI", nullable = false)
    private String emoji; // 이모지

    @Column(name = "IS_OPEN", nullable = false)
    private int open; // 일기 공개 여부

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime create_at; // 일기 공개 여부

    @UpdateTimestamp
    @Column(name = "UPDATED_AT")
    private LocalDateTime updated_at; // 일기 공개 여부

    //빌더
    @Builder
    public Diary(long id, String title, String content, int happiness, String emoji, int open, long userid) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.happiness = happiness;
        this.emoji = emoji;
        this.open = open;
        this.userid = userid;
    }
}
