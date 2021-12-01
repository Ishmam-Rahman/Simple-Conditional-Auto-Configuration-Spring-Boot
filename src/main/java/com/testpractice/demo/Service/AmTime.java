package com.testpractice.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class AmTime implements Time {
  public String getTime() {
    return "It's AM";
  }
}
