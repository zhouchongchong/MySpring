package com.java.datastructure.linkedlist;

/**
 * @Author: aiying014
 * Created by Hai Yan on 22:26 2017/12/20.
 * @Description:
 */
public class CQueue {
	int front;
	int rear;
	int size;
	Integer[] array;

	public CQueue() {
		front =0;
		rear =0;
		size = 10;
		array = new Integer[size];
	}
	public boolean isEmpty(){
		if (front == rear){
			System.out.println("队列为空");
			return true;
		}
		return false;
	}

	public boolean isFull(){
		if ((rear+1) % size ==front){
			System.out.println("队列已满");
			return true;
		}
		return false;
	}
	public void inQueue(int data){
		if (!isFull()){
			array[rear] = data;
			rear = (rear + 1) % size;
		}
	}
	public int outQueue(){
		int item ;
		if (!isEmpty()){
			item = array[front];
			front = (front+1) % size;
			return item;
		}else {
			return -1;
		}
	}

	public void display(){
		int f = front;
		int r = rear;
		System.out.println("f="+f + "r = " + r);
		while (!(f  == r)){
			System.out.println(array[f]);
			f = (f+1) % size;
		}
	}

	public static void main(String[] args) {
		CQueue sQueue = new CQueue();
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
			System.out.println(sQueue.outQueue());
		}
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
	}
}
