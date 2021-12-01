package com.testpractice.demo.Controller;

import com.testpractice.demo.Service.Time;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoRestController {

  public static final Logger logger = LoggerFactory.getLogger(DemoRestController.class);

  @Qualifier("time")
  @Autowired
  private Time time;


  @GetMapping(value = "/time")
  public String location(){
    logger.info("Now time is in "+ time.getTime());
    return LocalTime.now() + ", "+ time.getTime();
  }

  @GetMapping
  public String index(){
    logger.info("Ishmam Rahman");
    return "Learning Conditional Auto Configaration";
  }
}
