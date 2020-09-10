package com.fafamc.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiService {


    @Autowired
    private RuntimeService runtimeService;


    @Autowired
    private TaskService taskService;


    public void activitiDemo(){
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("businessinfo");
        System.out.println(processInstance.getName());
        System.out.println(processInstance.getProcessDefinitionKey());
    }
}