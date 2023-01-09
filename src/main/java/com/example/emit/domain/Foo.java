package com.example.emit.domain;

public class Foo {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	private String name;

	public Foo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Foo() {
		super();
	}

	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + "]";
	}

}
