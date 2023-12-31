package com.example.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab6Application {

  public static void main(String[] args) {
    SpringApplication.run(Lab6Application.class, args);
  }

  @GetMapping
  public String get(){
    return "Jenkin's pipeline";
  }

}
