package app65;
class B extends Thread{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	
		
	}
}
public class M5 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	System.out.println(t1.isDaemon());
	System.out.println("---------------");
	t1.setPriority(Thread.MAX_PRIORITY);
	B b1 = new B();
//	b1.start();
	b1.run();
	// child thread did not get thread ness featurethis run method execute by main thread only  
}
}
