package com.java8.application;

import java.util.Comparator;

public class RunnableExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Comparator<Integer> compartor = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
		};
				
				
		System.out.println("Reuslt : "+compartor.compare(3, 2));
				
		
		
		Comparator<Integer> lambdaCompartor = ( arg0,   arg1) -> { return arg0.compareTo(arg1); };
		
		System.out.println("Reuslt : "+lambdaCompartor.compare(1, 2));
		
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Running a Thread - Normal");
				
			}
		};
		
				
		Thread t1  = new Thread(runnable);
		t1.start();
		
				
		Runnable runnableLamda  = () -> { System.out.println("Running a Thread - Lambda");  };
		
		
		Thread t2  = new Thread(runnableLamda);
		t2.start();
		
		
		PersonRecord p1 = new PersonRecord("Arthur", 4);
		
		System.out.println(p1.age());
		System.out.println(p1.name());
		
		
		
		
		
		
	}

}
