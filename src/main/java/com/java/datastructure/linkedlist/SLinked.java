package com.java.datastructure.linkedlist;

import com.java.datastructure.linkedlist.Interface.List;
import com.java.science.beans.Student;

/**
 * @Author: aiying014
 * Created by Hai Yan on 21:36 2017/12/19.
 * @Description:
 */
public class SLinked implements List {
	private SNode head;
	private SNode current;
	private int size;

	public SLinked() {
		head = new SNode();
		size = 0;
	}

	@Override
	public void add(Object object) {
		current = head;

		SNode data = new SNode((Student) object);
		while (current.getNext() != null) {

			current = current.getNext();
		}
		data.setPrior(current);
		current.setNext(data);
	}

	@Override
	public boolean isEmpty() {
		current = head;
		if (current.getNext() != null) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		current = head;
		while (current.getNext() != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	@Override
	public void del(Object object) {
		current = head;
		String name = (String) object;
		while (current.getNext() != null) {
			if (current.getNext().getStudent().getName().equals(name)) {
				current.setNext(current.getNext().getNext());
				return;
			}
			current = current.getNext();
		}
	}

	public void addByAge(Student student) {
		current = head;
		SNode data = new SNode(student);
		while (current.getNext() != null) {
			if (current.getNext().getStudent().compareTo(student) > 0) {
				current.getNext().setPrior(data);
				data.setNext(current.getNext());
				current.setNext(data);
				data.setPrior(current);
				return;
			}
			current = current.getNext();
		}
		data.setPrior(current);
		current.setNext(data);
	}

	@Override
	public void display() {
		current = head;
		while (current.getNext() != null) {
			System.out.println(current.getNext().getStudent());
			current = current.getNext();
		}
	}
	private void reDisplay(){
		current = head;
		while (current.getNext() != null){
			current = current.getNext();
		}
		while (current.getPrior() !=null){
			System.out.println(current.getStudent());
			current = current.getPrior();
		}
	}
	public static void main(String[] args) {
		Student n1 = new Student("1208431025", "周冲", 24);
		Student n2 = new Student("1208431032", "张九林", 23);
		Student n3 = new Student("1208431045", "程磊", 22);
		Student n4 = new Student("1208431011", "陈真", 25);
		SLinked linked = new SLinked();
		linked.addByAge(n1);
		linked.addByAge(n2);
		linked.addByAge(n3);
		linked.addByAge(n4);
		System.out.println(linked.size());
		linked.display();
		linked.reDisplay();

	}
}
