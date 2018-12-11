package com.ci.li;

import java.util.List;

public class QuestionLis2 {
	
	private int id;
	private String name;
	private List<Answer2> answers;
	public QuestionLis2(int id, String name, List<Answer2> answers) {
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
