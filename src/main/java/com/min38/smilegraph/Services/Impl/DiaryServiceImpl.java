package com.min38.smilegraph.Services.Impl;

import com.min38.smilegraph.Dto.DiaryDto;
import com.min38.smilegraph.Entities.Diary;
import com.min38.smilegraph.Exceptions.ResourceNotFoundException;
import com.min38.smilegraph.Mappers.DiaryMapper;
import com.min38.smilegraph.Repositories.DiaryRepository;
import com.min38.smilegraph.Services.DiaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;

    public DiaryServiceImpl(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    @Override
    public DiaryDto saveDiary(DiaryDto diaryDto) {
        Diary diary = DiaryMapper.mapToDiary(diaryDto);
        Diary savedDiary = diaryRepository.save(diary);
        return DiaryMapper.mapToDiaryDto(savedDiary);
    }

    @Override
    public DiaryDto getDiaryById(long diaryId) {
        Diary diary = diaryRepository.findById(diaryId)
                .orElseThrow(() -> new ResourceNotFoundException("Diary is not exist with given id : " + diaryId));

        return DiaryMapper.mapToDiaryDto(diary);
    }

    @Override
    public DiaryDto getDiaryByUserId(long userId) {
        return null;
    }

    @Override
    public List<DiaryDto> getAllDiaries() {
        List<Diary> diaries = diaryRepository.findAll();
        return diaries.stream().map((diary) -> DiaryMapper.mapToDiaryDto(diary))
                .collect(Collectors.toList());
    }

    @Override
    public DiaryDto updateDiary(long diaryId, DiaryDto updateDiary) {
        Diary diary = diaryRepository.findById(diaryId)
                .orElseThrow(() -> new ResourceNotFoundException("Diary is not exists with given id : " + diaryId));

        diary.setTitle(updateDiary.getTitle());
        diary.setContent(updateDiary.getTitle());
        diary.setHappiness(updateDiary.getHappiness());
        diary.setEmoji(updateDiary.getEmoji());
        diary.setOpen(updateDiary.getOpen());

        Diary updatedDiaryObj = diaryRepository.save(diary);

        return DiaryMapper.mapToDiaryDto(updatedDiaryObj);
    }

    @Override
    public void deleteDiary(long diaryId) {
        Diary diary = diaryRepository.findById(diaryId)
                .orElseThrow(() -> new ResourceNotFoundException("Diary is not exists with given id : " + diaryId));

        diaryRepository.deleteById(diaryId);
    }
}
