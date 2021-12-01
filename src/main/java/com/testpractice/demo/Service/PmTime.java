package com.testpractice.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PmTime implements Time {
  public String getTime() {
    return "It's PM";
  }
}
