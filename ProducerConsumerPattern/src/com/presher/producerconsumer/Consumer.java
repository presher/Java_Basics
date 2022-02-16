package com.presher.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {
	//stay away from wait and notify if possible primitive methods for Threads. Should use Concurrent methods.

	List<Integer> questionList = null;//shared resource
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void answerQuestion() throws InterruptedException {
		synchronized(questionList) {
			while(questionList.isEmpty()) {
				System.out.println("No questions to answer... Waiting for producer to get answers");//not good enough
				questionList.wait();//waits to be notified to continue passes control can only be called in synchronized block
			}
		}
		
		synchronized(questionList) {
			Thread.sleep(5000);
			System.out.println("Answered question: " + questionList.remove(0));
			questionList.notify();//notifies producer questions have been answered can only be called in synchronized block
		}
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

