package com.min38.smilegraph.Services;

import com.min38.smilegraph.Dto.DiaryDTO;
import com.min38.smilegraph.Entities.Diary;
import com.min38.smilegraph.Repositories.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 
public class DiaryService {

    @Autowired
    DiaryRepository diaryRepository;

    // 일기 저장
    public Long post(DiaryDTO dto) {
        Diary diary = new Diary();
        diary.setTitle(dto.getTitle());
        diary.setContent(dto.getContent());
        diary.setHappiness(dto.getHappiness());
        diary.setEmoji(dto.getEmoji());
        diary.setOpen(0); // 일단 무조건 공개 TODO: 공개 여부 선택 가능하도록

        return diaryRepository.save(diary).getId();
    }
}
