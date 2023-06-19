package br.com.coruja.application.controller;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/api/ola")
  public String index() {
    return "Olá Mundo!";
  }

}