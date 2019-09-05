package Thread;

public class GuessOp01 implements Runnable
{
	public void run()
	{
		System.out.printf("%d", ೪);
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread thread = new Thread(new GuessOp01() );
		thread.start();
		System.out.printf("%d",1);
		thread.join(); 
        System.out.printf("%d",2); 
	}
}
