package ThreadExamples;


class Runner extends Thread{

	@Override
	public void run() {
		for ( int i=0;i<10;i++) {
			System.out.println("item "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class AppThread {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Thread t1= new Thread(r1);
		t1.start();
		
		Runner r2 = new Runner();
		r2.start();
	}

}
