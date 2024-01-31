package com.min38.smilegraph.Dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryDto {
    private long id;
    @NotEmpty // 빈 값 들어오면 에러
    private String title;
    @NotEmpty
    private String content;
    private int happiness = 50;
    private String emoji;
    private int open;
    @NotEmpty
    private long userid;
}
