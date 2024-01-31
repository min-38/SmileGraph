package com.min38.smilegraph.Mappers;

import com.min38.smilegraph.Dto.DiaryDto;
import com.min38.smilegraph.Entities.Diary;

public class DiaryMapper {

    public static DiaryDto mapToDiaryDto(Diary diary) {
        return new DiaryDto(
                diary.getId(),
                diary.getTitle(),
                diary.getContent(),
                diary.getHappiness(),
                diary.getEmoji(),
                diary.getOpen(),
                diary.getUserid()

        );
    }

    public static Diary mapToDiary(DiaryDto diaryDto) {
        return new Diary(
                diaryDto.getId(),
                diaryDto.getTitle(),
                diaryDto.getContent(),
                diaryDto.getHappiness(),
                diaryDto.getEmoji(),
                diaryDto.getOpen(),
                diaryDto.getUserid()
        );
    }
}
