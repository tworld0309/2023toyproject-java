package com.boot3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Tag(name="Test Controller", description="Test Controller 구현하기")
public class TestController {

    @GetMapping("/health")
    @Operation(description = "Application Health Info 조회하기")
    public String healthInfo(){
        return "health";
    }

}
