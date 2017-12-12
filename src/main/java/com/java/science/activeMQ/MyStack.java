package com.java.science.activeMQ;

import java.util.LinkedList;

/**
 * @Author: aiying014
 * Created by zcc on 18:28 2017/11/30.
 * @Description:
 */
public class MyStack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public synchronized void push(T e){
		storage.addFirst(e);
	}

	public T peek(){
		return storage.getFirst();
	}

	public void pop(){
		storage.removeFirst();
	}

	public boolean empty(){
		return storage.isEmpty();
	}

	@Override
	public String toString() {
		return "MyStack{" +
				"storage=" + storage.toString() +
				'}';
	}
}
