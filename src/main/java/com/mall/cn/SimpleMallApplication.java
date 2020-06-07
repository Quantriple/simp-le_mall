package com.mall.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mall.cn.model")
public class SimpleMallApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimpleMallApplication.class, args);
  }

}
