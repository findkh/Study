package com.hyuncode.cafe24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


//@EnableTransactionManagement //애노테이션으로 트랜잭션을 제어할 수 있게 설정한다.
@RestController
@SpringBootApplication
public class Cafe24Application {

  public static void main(String[] args) {
    SpringApplication.run(Cafe24Application.class, args);
  }

}
