package com.presher.threading;

public class Application {

	public static void main(String[] args) {//Main thread to run
		
		System.out.println("Starting thread A");
		Task taskRunner = new Task("Thread-A");
		taskRunner.start();//may only have one instance of a thread running at a time. Exception in main error if the same thread is run again
		
		System.out.println("Starting thread B");
		
		//To have the same code run more than once in a different thread use an instance of the class
		
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.start();//run same code in a new thread
		
		System.out.println("Starting thread C");
		Thread t1 = new Thread( new Task1("Thread-C"));//Task1 is now multi-threaded can also start new class object from thread class directly
		t1.start();
		//taskRunner1.run();//Not multi-threaded
		
		System.out.println("Starting thread D");
		
		//To have the same code run more than once in a different thread use an instance of the class
		Thread t2 = new Thread( new Runnable() {//Another way of creating a thread
			@Override
			public void run(){
				Thread.currentThread().setName("Thread-D");
				for(int i = 0; i < 1000; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
	});//Task21 is now multi-threaded
		t2.start();
		//taskRunner21.run();//
		
		
	}

}

class Task1 implements Runnable{// not multi threaded
	
	String name;
	
	public Task1(String name) {
		this.name = name;
	}

	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i = 0; i < 1000; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Task extends Thread{
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}

	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i = 0; i < 1000; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}