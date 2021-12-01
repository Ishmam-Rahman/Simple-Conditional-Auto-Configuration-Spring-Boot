package com.testpractice.demo;

import com.testpractice.demo.Condition.PmCondition;
import com.testpractice.demo.Condition.AmCondition;
import com.testpractice.demo.Service.PmTime;
import com.testpractice.demo.Service.Time;
import com.testpractice.demo.Service.AmTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;


@SpringBootApplication
public class DemoApplication {

  public static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean(name = "time")
  @Conditional(AmCondition.class)
  public Time getAmTime() {
    logger.info("AM!!!!");
    return new AmTime();
  }

  @Bean(name = "time")
  @Conditional(PmCondition.class)
  public Time getPmTime() {
    logger.info("PM!!!!");
    return new PmTime();
  }

}
