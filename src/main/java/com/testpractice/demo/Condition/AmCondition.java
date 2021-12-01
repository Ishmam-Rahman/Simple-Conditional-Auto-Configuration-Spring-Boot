package com.testpractice.demo.Condition;


import java.time.LocalTime;
import java.util.Locale;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AmCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    LocalTime localTime = LocalTime.of(12,00,00,00000);
    return LocalTime.now().isBefore(localTime);
  }
}
