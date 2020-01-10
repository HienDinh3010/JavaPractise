package com.designprinciple.liskovsubstitution;

public class MentionPost extends Post {

	public void createMentionPost(String content) {
		System.out.println("Add Post " + content);
		
		//Another steps
		System.out.println("Notify to @User");
	}
}
