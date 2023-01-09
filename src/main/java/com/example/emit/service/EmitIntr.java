package com.example.emit.service;

import java.util.List;

import com.example.emit.domain.Foo;

import reactor.core.publisher.Flux;

public interface EmitIntr {

	Flux<List<Foo>> getFoo();

	

}
