package com.designpattern.factory;

public abstract class AbstractModel {
	private String name;

	public AbstractModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
