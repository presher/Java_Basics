package com.presher.producerconsumer;

import java.util.List;

public class Producer implements Runnable {
	//stay away from wait and notify if possible primitive methods for Threads. Should use Concurrent methods.

	List<Integer> questionList = null;//shared resource
	final int LIMIT = 5;
	private int questionNo; 
	
	
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized(questionList) {
			while(questionList.size() == LIMIT) {
				System.out.println("Questions have piled up... wait for answers");//not good enough
				questionList.wait();//waits to be notified to continue passes control can only be called in synchronized block
			}
		}
		
		synchronized(questionList) {
			System.out.println("New question: " + questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();//notifies all tasks that things are available can only be called in synchronized block
		}
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		

}
