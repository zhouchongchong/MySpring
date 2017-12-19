package com.java.science.Spring.thread;

/**
 * @Author: aiying014
 * Created by zcc on 19:19 2017/12/13.
 * @Description:
 */
public class TestThread  {
	public static void main(String[] args) {
		BeTestA a = new BeTestA();
		BeTestA b = new BeTestA();
		Mythread  mythread = new Mythread("线程1",a);
		Myteread2  mythread1 = new Myteread2("线程2",a);

		Thread t1 = new Thread(mythread);
		Thread t2 = new Thread(mythread1);
		t1.start();
		t2.start();
		System.out.println(Mythread.number);
	}
}

class Mythread extends Thread{
	private BeTestA A ;
	/**
	 * Allocates a new {@code Thread} object. This constructor has the same
	 * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
	 * {@code (null, null, name)}.
	 *
	 * @param name the name of the new thread
	 */
	public Mythread(String name,BeTestA a) {
		super(name);
		A = a;
	}

	public static Integer number = 0;
	@Override
	public void run(){
		A.A(this.getName());;

	}
}

class Myteread2 extends Thread {
	private BeTestA A ;
	/**
	 * Allocates a new {@code Thread} object. This constructor has the same
	 * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
	 * {@code (null, null, name)}.
	 *
	 * @param name the name of the new thread
	 */
	public Myteread2(String name,BeTestA a) {
		super(name);
		A = a;
	}
	public static Integer number = 0;
	@Override
	public void run(){
		A.B(this.getName());

	}
}