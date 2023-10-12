package com.example.test.test;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hi")
public class TestController {

    private final TestService service;

    @GetMapping("")
    public String test() {
        return "sdd";
    }

    @PostMapping("")
    public int postTest(@RequestBody UserRegistDto userRegistDto){
        int result = service.registMember(userRegistDto);

        return result;
    }
}
