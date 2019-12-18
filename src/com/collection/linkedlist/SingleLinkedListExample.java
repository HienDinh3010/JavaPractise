package com.collection.linkedlist;

import java.util.LinkedList;

public class SingleLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");//= addLast()
		linkedList.add("B");
		linkedList.add("C");
		
		linkedList.add(1, "BB");
		linkedList.stream().forEach(item -> System.out.println(item));
		
		
	}

}
