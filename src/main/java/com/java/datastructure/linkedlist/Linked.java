package com.java.datastructure.linkedlist;


import com.java.datastructure.linkedlist.Interface.List;

/**
 * @Author: aiying014
 * Created by zcc on 11:02 2017/12/19.
 * @Description:
 */
public class Linked implements List {
	//琛ㄥご
	private Node head;
	//褰撳墠鑺傜偣瀵硅薄
	Node p;
	//鑺傜偣涓暟
	int size;
	
	public Linked() {
		head = new Node();
		size = 0;
	}
	@Override
	public void add(Object name) {
		p = head;
		Node data = new Node((String)name);
		while (p.getNext() != null) {
			//绉诲姩鎸囬拡
			p = p.getNext();
		}
		p.setNext(data);
	}

	@Override
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

	@Override
	public int size() {
		p = head;
		while (p.getNext() != null) {
			size++;
			p = p.getNext();
		}
		return size;
	}


	@Override
	public boolean isEmpty(){
		if (head.getNext() == null){
			return true;
		}
		return false;
	}
	@Override
	public void del(Object name) {
		p = head;
		while (p.getNext() != null) {
			if (p.getNext().getName().equals((String) name)) {
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
		String[] strs = new String[]{"灏忔槑", "灏忕帇", "灏忓紶"};
		for (String str : strs) {
			link.add(str);
		}
		link.display();
		link.del("灏忓紶");
		System.out.println(link.isEmpty());
		System.out.println("link鐨勫ぇ灏忎负锛�" + link.size());
		link.cir();
		link.display();
	}
}
