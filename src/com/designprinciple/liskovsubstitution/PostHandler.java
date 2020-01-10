package com.designprinciple.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class PostHandler {
	public void handlePost() {
		List<String> contents = getPostContent();
		
		
		for (String content: contents) {
			Post post;
			if (content.startsWith("@")) {
				//post = new MentionPost();
				post = new CorrectMentionPost();
			} else if (content.startsWith("#" )) {
				post = new TagPost();
			} else {
				post = new Post();
			}
			
			post.createPost(content);
		}
	}
	
	private List<String> getPostContent() {
		List<String> contents = new ArrayList<>();
		contents.add("@nhim loves christmas");
		contents.add("@anthu loves candy");
		contents.add("#BaTo Quang Ngai");
		contents.add("Nothing special");
		return contents;
	}
}
