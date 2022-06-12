//Practical Question - 21

import java.lang.*;
public class PracQues21 extends Thread {

	// Method 1
	// run() method for the thread that is called
	// as soon as start() is invoked for thread in main()
	public void run()
	{
		System.out.println("Inside run method");
	}

	public static void main(String[] args)
	{
		// Creating random threads
		// with the help of above class
		PracQues21 t1 = new PracQues21();
		PracQues21 t2 = new PracQues21();
		PracQues21 t3 = new PracQues21();

		// Thread 1
		// Display the priority of above thread
		System.out.println("t1 thread priority : "+ t1.getPriority());

		// Thread 2
		// Display the priority of above thread
		System.out.println("t2 thread priority : "+ t2.getPriority());

		// Thread 3
		System.out.println("t3 thread priority : "+ t3.getPriority());

		// Setting priorities of above threads
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		System.out.println("----------------------------");
		System.out.println("t1 thread priority : "+ t1.getPriority());

		System.out.println("t2 thread priority : "+ t2.getPriority());

		System.out.println("t3 thread priority : "+ t3.getPriority());
		System.out.println("----------------------------");
		// Displays the name of currently executing Thread
		System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());

		System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);

		System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
	}
}

