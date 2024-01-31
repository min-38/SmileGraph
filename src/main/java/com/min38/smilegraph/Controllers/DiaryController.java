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
@RequestMapping("/api/diary")
public class DiaryController {

    private final DiaryService diaryService;

    // Build Add Diary REST API
    @ResponseBody
    @PostMapping(value = "/diary", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiaryDto> post(@RequestBody final DiaryDto diaryDto) {
        DiaryDto savedDiary = diaryService.saveDiary(diaryDto);
        return new ResponseEntity<>(savedDiary, HttpStatus.CREATED);
    }
}
