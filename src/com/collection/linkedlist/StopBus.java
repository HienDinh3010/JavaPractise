package com.collection.linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class StopBus implements Queue<String>{
	private String name;
	private String nextStopName;
	
	public StopBus(String name, String nextStopName) {
		super();
		this.name = name;
		this.nextStopName = nextStopName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNextStopName() {
		return nextStopName;
	}
	public void setNextStopName(String nextStopName) {
		this.nextStopName = nextStopName;
	}
	@Override
	public boolean addAll(Collection<? extends String> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean offer(String e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}	
}
