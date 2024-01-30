package com.min38.smilegraph.Controllers;

import com.min38.smilegraph.Dto.DiaryDTO;
import com.min38.smilegraph.Services.DiaryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequiredArgsConstructor
public class DiaryController {

    private final DiaryService diaryService;
    @ResponseBody
    @PostMapping(value = "/diary", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity post(@RequestBody final DiaryDTO dto) {
        Long diaryId = diaryService.post(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(diaryId);
    }
}
