package com.ci.li;

import java.util.List;

public class QuestionLis {
	
	private int id;
	private String name;
	private List<String> answers;
	public QuestionLis(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
	
}
