import java.util.*;
public class StopWatch {	
		public long startTimer = 0;
		public long stopTimer = 0;
		public long elapsed;
		 void start()
		{
			startTimer = System.currentTimeMillis();
			System.out.println("Start Time is: "+startTimer);
		}	
		void stop()

		{
			stopTimer = System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTimer);
		}


		long getElapsedTime()
		{
			elapsed = stopTimer-startTimer;
			return elapsed;
	    }
	public static void main(String[] args) {
		StopWatch a = new StopWatch();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Press '0' to Start: ");
		int start = scanner.nextInt();
		a.start();

		System.out.println();
		System.out.println("Press '1' to Stop: ");
		int stop = scanner.nextInt();
		a.stop();

		long l = a.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}
