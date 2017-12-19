package com.java.datastructure.linkedlist;

/**
 * @Author: aiying014
 * Created by zcc on 10:54 2017/12/19.
 * @Description:
 */
public class Node {
	private String name;

	private Node next;

	public Node() {
		name = null;
		next = null;
	}

	public Node(String name) {
		this.name = name;
		next = null;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
