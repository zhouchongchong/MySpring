package com.java.science.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: aiying014
 * Created by zcc on 18:18 2017/12/6.
 * @Description:
 */
public class MyTask implements Callable{
	private int upperBands;

	public MyTask(int upperBands) {
		this.upperBands = upperBands;
	}

	/**
	 * Computes a result, or throws an exception if unable to do so.
	 *
	 * @return computed result
	 * @throws Exception if unable to compute a result
	 */
	public Object call() throws Exception {
		int sum = 0;
		for (int i = 1; i <=upperBands;i++){
			sum += i;
		}
		return sum;
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i =0; i < 10; i++){
			list.add(service.submit(new MyTask((int)(Math.random()*100))));
		}
		int sum = 0;
		for (Future<Integer> future:list){
			sum += future.get();
		}
		System.out.println(sum);
	}
}