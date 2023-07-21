package ParallelStreams;

import java.util.stream.IntStream;

/*
 * 			Sequential Stream 								parallel Stream
 * 	Core1	Core2	Core3	Core4 						Core1	 Core2	 Core3	 Core4 
 * Thread1											   Thread1	Thread2	Thread3 Thread4
 * Thread2														Thread5
 * Thread3
 * Thread4
 * 
 * In this all threads are operated by 					In this single task is sub divided into multiple parts 
 * 	single core											based on threshold limit and each part is taken by 
 * 														Separate core and finally join 
 */


public class SequentialAndParallel {
	public static void main(String[] args) {
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(0, 1000).filter(x->(x%2)==0).forEach(x->System.out.print(x));
		end=System.currentTimeMillis();
		System.out.println("/n");
		System.out.println("Time in seconds for Sequential Stream  = "+ (end-start));
		
		start=0;
		end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(0, 1000).parallel().filter(x->(x%2)==0).forEach(x->System.out.print(x));
		end=System.currentTimeMillis();
		System.out.println("/n");
		System.out.println("Time in seconds for Parallel Stream  = "+ (end-start));
		
	}

}
