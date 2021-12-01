package com.testpractice.demo.Condition;

import java.time.LocalTime;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PmCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    LocalTime localTime = LocalTime.of(11,59,59,00000);
    return (LocalTime.now().isAfter(localTime));
  }
}
