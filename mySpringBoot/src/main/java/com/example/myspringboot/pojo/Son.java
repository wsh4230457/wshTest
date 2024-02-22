package com.example.myspringboot.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Son {
    private String name;
    private Integer age;
    private String gender;
}
