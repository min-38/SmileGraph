package com.min38.smilegraph.Controllers;

import com.min38.smilegraph.Dto.DiaryDto;
import com.min38.smilegraph.Services.DiaryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/diary")
public class DiaryController {

    private final DiaryService diaryService;

    // Build Add Diary REST API
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiaryDto> post(@RequestBody final DiaryDto diaryDto) {
        DiaryDto savedDiary = diaryService.saveDiary(diaryDto);
        return new ResponseEntity<>(savedDiary, HttpStatus.CREATED);
    }

    // Build Get Diary REST API
    @GetMapping("{id}")
    public ResponseEntity<DiaryDto> getDiaryById(@PathVariable("id") Long diaryId) {
        DiaryDto diaryDto = diaryService.getDiaryById(diaryId);
        return ResponseEntity.ok(diaryDto);
    }

    // Build Update Diary REST API
    @PutMapping("{id}")
    public ResponseEntity<DiaryDto> updateDiary(@PathVariable("id") long diaryId, @RequestBody DiaryDto updateDiary) {
        DiaryDto diaryDto = diaryService.updateDiary(diaryId, updateDiary);
        return ResponseEntity.ok(diaryDto);
    }

    // Build Delete Diary REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDiary(@PathVariable("id") long diaryId) {
        diaryService.deleteDiary(diaryId);
        return ResponseEntity.ok("Diary deleted successfully");
    }
}
