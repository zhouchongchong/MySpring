package com.java.datastructure.linkedlist;

import com.java.science.beans.Student;

/**
 * @Author: aiying014
 * Created by Hai Yan on 21:51 2017/12/19.
 * @Description:
 */
public class SNode {
	private SNode prior;

	public SNode getPrior() {
		return prior;
	}

	public void setPrior(SNode prior) {
		this.prior = prior;
	}

	private Student student;

	private SNode next;

	public SNode() {
		prior = null;
		student = null;
		next = null;
	}

	public SNode(Student student) {
		this.student = student;
		next = null;
		prior = null;
	}

	public SNode getNext() {
		return next;
	}

	public void setNext(SNode next) {
		this.next = next;
	}

	public Student getStudent() {

		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
