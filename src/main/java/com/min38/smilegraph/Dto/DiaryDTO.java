package com.min38.smilegraph.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
public class DiaryDTO {
    @NotEmpty // 빈 값 들어오면 에러
    private String title;
    @NotEmpty
    private String content;
    private int happiness = 50;
    private String emoji;
}
