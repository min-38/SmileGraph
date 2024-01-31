package com.min38.smilegraph.Services.Impl;

import com.min38.smilegraph.Dto.DiaryDto;
import com.min38.smilegraph.Entities.Diary;
import com.min38.smilegraph.Mappers.DiaryMapper;
import com.min38.smilegraph.Repositories.DiaryRepository;
import com.min38.smilegraph.Services.DiaryService;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService {

    private DiaryRepository diaryRepository;

    @Override
    public DiaryDto saveDiary(DiaryDto diaryDto) {

        Diary diary = DiaryMapper.mapToDiary(diaryDto);
        Diary savedDiary = diaryRepository.save(diary);
        return DiaryMapper.mapToDiaryDto(savedDiary);
    }
}
