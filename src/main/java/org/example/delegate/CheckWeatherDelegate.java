package org.example.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class CheckWeatherDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random random = new Random();
        execution.setVariable("name", "Dana");
        execution.setVariable("weatherOk", random.nextBoolean());
    }
}
