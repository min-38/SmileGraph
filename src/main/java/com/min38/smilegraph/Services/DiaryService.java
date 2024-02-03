package com.min38.smilegraph.Services;

import com.min38.smilegraph.Dto.DiaryDto;

import java.util.List;

public interface DiaryService {
    DiaryDto saveDiary(DiaryDto diaryDto);
    DiaryDto getDiaryById(long id);
    DiaryDto getDiaryByUserId(long userId);
    List<DiaryDto> getAllDiaries();

    DiaryDto updateDiary(long diaryId, DiaryDto updateDiary);

    void deleteDiary(long diaryId);
}
