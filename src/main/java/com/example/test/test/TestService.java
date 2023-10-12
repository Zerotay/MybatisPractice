package com.example.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper){
        this.testMapper = testMapper;
    }

    @Transactional
    public int registMember(UserRegistDto userRegistDto) {

        try{
            int result = testMapper.registMember(userRegistDto);

            return result;
        } catch (Exception e){
            System.out.println("error");
            return -1;
        }

    }
}
