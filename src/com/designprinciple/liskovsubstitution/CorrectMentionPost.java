package com.designprinciple.liskovsubstitution;

public class CorrectMentionPost extends Post {

	@Override
	public void createPost(String content) {
		// TODO Auto-generated method stub
		super.createPost(content);
		//Another steps
		System.out.println("Notify to @User");
	}

	
}
