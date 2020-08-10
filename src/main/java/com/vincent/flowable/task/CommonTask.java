package com.vincent.flowable.task;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class CommonTask implements JavaDelegate{
    @Override
    public void execute(DelegateExecution execution) {
        String var = (String) execution.getVariable("input");
        System.out.println("test param input<<<<<<<<<<<<<<<<<:"+var);
    }
}
