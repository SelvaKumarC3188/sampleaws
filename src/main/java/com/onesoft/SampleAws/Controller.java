package com.onesoft.SampleAws;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@GetMapping(value="/get")
public String get() {
	return "RAVIBHAI";
}
}
