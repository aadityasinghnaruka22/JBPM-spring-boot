package com.ebit.kieServerTest.controller;

import java.util.List;

import org.kie.server.api.model.instance.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.kieServerTest.service.KieServerService;

@RestController
public class ProcessInstanceController {

	@Autowired
	private KieServerService kieServerService;

	@GetMapping("/process-instances")
	public List<ProcessInstance> getProcessInstances() {
		return kieServerService.getAllProcessInstances();
	}

	@GetMapping("/process-instances/{containerId}")
	public List<ProcessInstance> getProcessInstances(@PathVariable String containerId) {
		return kieServerService.getAllProcessInstances(containerId);
	}

	@PostMapping("/send-signal")
	public void sendSignal(@RequestParam("containerId") String containerId,
			@RequestParam("processInstanceId") long processInstanceId, @RequestParam("signalName") String signalName) {
//	        kieServerService.sendSignalToProcessInstance(containerId, processInstanceId, signalName);
	}

}