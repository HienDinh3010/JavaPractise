package com.collection.linkedlist;

import java.util.LinkedList;

public class SingleLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("B");//= addLast()
		linkedList.add("Z");
		linkedList.add("C");

		linkedList.stream().forEach(item -> System.out.println(item));
		
		
	}

}
