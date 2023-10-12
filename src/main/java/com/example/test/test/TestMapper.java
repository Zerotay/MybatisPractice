package com.example.test.test;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    int registMember(UserRegistDto userRegistDto);
}
