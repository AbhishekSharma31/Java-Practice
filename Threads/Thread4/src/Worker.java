import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private static List<Integer> list1 = new ArrayList<Integer>();
	private static List<Integer> list2 = new ArrayList<Integer>();

	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}

	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));

		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting....");

		long start = System.currentTimeMillis();

		Worker work = new Worker();
		// work.process();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				work.process();
			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				work.process();
			}
		});

		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("Tima taken: " + (end - start));
		System.out.println("List1: " + list1.size() + "; List 2: "
				+ list2.size());
	}

}
