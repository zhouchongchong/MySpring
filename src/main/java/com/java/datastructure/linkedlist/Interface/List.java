package com.java.datastructure.linkedlist.Interface;

/**
 * @Author: aiying014
 * Created by Hai Yan on 21:37 2017/12/19.
 * @Description:
 */
public interface List<T> {
	public void add(T object);

	public boolean isEmpty();

	public int size();

	public void del(T object);

	public void display();
}
