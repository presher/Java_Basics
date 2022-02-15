package com.presher.client;

import com.presher.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		inventoryTask.start();
		//inventoryTask.join();//wait until the task is completed the move on to the next task not multi-threaded sequntial
		Thread.sleep(2000);
		displayTask.start();
	}

}
