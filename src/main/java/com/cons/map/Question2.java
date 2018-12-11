package com.cons.map;

import java.util.Map;

public class Question2 {
	
	private int id;
	private String name;
	private Map<Answer2, User> answers;
	public Question2(int id, String name, Map<Answer2, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question2 [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
}