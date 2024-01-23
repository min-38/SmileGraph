package com.min38.smilegraph.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {
    @PostMapping(value = "/diary", produces = MediaType.APPLICATION_JSON_VALUE)
    public String add() {
        return "eeerrr";
    }
}
