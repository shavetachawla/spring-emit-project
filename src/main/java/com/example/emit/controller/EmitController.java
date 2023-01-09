package com.example.emit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emit.domain.Foo;
import com.example.emit.service.EmitIntr;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class EmitController {

	@Autowired
	private EmitIntr EmitIntr;

	@RequestMapping("/get")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public  Flux<List<Foo>> getFoo() {
		return EmitIntr.getFoo();

	}
}
