package com.min38.smilegraph.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Builder 패턴, static한 클래스를 이용해서 편리하게 사용할 수 있게 도와줌
// 빌더 패턴(Builder pattern) 이란 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴
// 빌더패턴을 활용하면 어떤 필드에 어떤 인자를 넣어줬는지 명확히 알 수 있고, 넣어줄 필요 없는 필드(null)는 굳이 선언할 필요 없으니 좋다고 생각했다.
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DiaryModel {
    private int id;
    private String title;
    private String content;
    private LocalDateTime regDate;
}
