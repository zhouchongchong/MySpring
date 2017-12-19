package com.java.datastructure.linkedlist;


import java.util.List;

/**
 * @Author: aiying014
 * Created by zcc on 11:02 2017/12/19.
 * @Description:
 */
public class Linked {
	//表头
	private Node head;
	//当前节点对象
	Node p;
	//节点个数
	int size;

	public Linked() {
		head = new Node();
		size = 0;
	}

	public void add(String name) {
		p = head;
		Node data = new Node(name);
		while (p.getNext() != null) {
			//移动指针
			p = p.getNext();
		}
		p.setNext(data);
	}

	public void display() {
		p = head;
		while (p.getNext() != null) {
			if (p.getNext().getName() != null){
				System.out.println(p.getNext().getName());
			} else {
				return;
			}
			p = p.getNext();
		}
	}

	public int size() {
		p = head;
		while (p.getNext() != null) {
			size++;
			p = p.getNext();
		}
		return size;
	}
  	public boolean isEmpty(){
		if (head.getNext() == null){
			return true;
		}
		return false;
	}
	public void del(String name) {
		p = head;
		while (p.getNext() != null) {
			if (p.getNext().getName().equals(name)) {
				p.setNext(p.getNext().getNext());
				return;
			}
			p = p.getNext();
		}
	}
	public void cir(){
  		p = head;
  		while (p.getNext() != null){
  			p = p.getNext();
		}
		p.setNext(head);
	}
	public static void main(String[] args) {
		Linked link = new Linked();
		String[] strs = new String[]{"小明", "小王", "小张"};
		for (String str : strs) {
			link.add(str);
		}
		link.display();
		System.out.println(link.isEmpty());
		System.out.println("link的大小为：" + link.size());
		link.cir();
		link.display();
	}
}
