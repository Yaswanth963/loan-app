package com.loanapp.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

	@PostMapping("/initiate-process")
	public ResponseEntity<String> startProcess() {
		String pid = "processId";
		return ResponseEntity.ok(pid);
	}
}
