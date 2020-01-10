package com.designprinciple.liskovsubstitution;

public class TagPost extends Post {

	@Override
	public void createPost(String content) {
		System.out.println("Tag someone " + content);
	}

}
