package com.example.emit.service;

import java.time.Duration;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.emit.domain.Foo;

import reactor.core.publisher.Flux;

@Service
public class EmitImpl implements EmitIntr {

	List<Foo> listOfFoo;

	EmitImpl() {
		listOfFoo = List.of(new Foo(1, "a"), new Foo(2, "b"), new Foo(3, "c"));

	}

	@Override
	public Flux<List<Foo>> getFoo() {
		return Flux.just(listOfFoo).delayElements(Duration.ofSeconds(1)).take(20).repeat().log();

	}

}
