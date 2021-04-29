package application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CarQueue implements Runnable {
	
	Queue<Integer> carQueue;
	Random random = new Random();
	
	public CarQueue() {
		carQueue = new LinkedList<>();
		carQueue.add(0);
		carQueue.add(3);
		carQueue.add(2);
		carQueue.add(2);
		carQueue.add(3);
	}
	
	public void addToQueue() {
		carQueue.add(random.nextInt(4));
	}

	public int deleteQueue() {
		if(!carQueue.isEmpty() )
			return carQueue.remove();
		else
			return 1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
