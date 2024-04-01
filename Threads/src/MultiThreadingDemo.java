public class MultiThreadingDemo {
	
	public static void main(String[] args) throws Exception {

		System.out.println("Thread ID : " + Thread.currentThread().getId());
		int n=5;
		
		for(int i=0;i<5;i++) {	
			ThreadDemo object = new ThreadDemo();
			object.start();
			Thread.sleep(1000);
		}
		
		System.out.println("Main Thread ID :  " + Thread.currentThread().getId());
	}
}
