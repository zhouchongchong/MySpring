package com.java.datastructure.linkedlist;

/**
 * @Author: aiying014
 * Created by Hai Yan on 21:26 2017/12/20.
 * @Description:
 */
public class SQueue {
	int front;
	int behind;
	int size;
	Integer[] sa;
	public SQueue() {
		this.front = 0;
		this.behind = 0;
		size = 10;
		sa = new Integer[size];
	}

	public void inQueue(int data){
		if (behind < size){
			sa[behind] = data;
			behind++;
		} else {
			System.out.println("队列已满！");
		}
	}

	public int outQueue(){
		int item = -1;
		if (front != behind){
			item = sa[front];
			front ++;
		} else {
			System.out.println("队列已空");
		}
		return item;
	}

	public void display(){
		int f = front;
		while (f < behind){
			System.out.println(sa[f]);
			f ++;
		}
	}

	public static void main(String[] args) {
		SQueue sQueue = new SQueue();
		sQueue.inQueue(1);
		sQueue.inQueue(2);
		sQueue.inQueue(3);
		sQueue.inQueue(4);
		sQueue.inQueue(5);
		sQueue.inQueue(6);
		sQueue.inQueue(7);
		sQueue.inQueue(8);
		sQueue.inQueue(9);
		sQueue.inQueue(10);
		sQueue.inQueue(11);
		sQueue.inQueue(12);
		sQueue.display();
		for (int i =0; i< 12;i++){
			sQueue.outQueue();
		}
		sQueue.display();

	}
}
