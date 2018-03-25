
public class Synchronized {

	public static void main(String[] args) {
		Shared shared=new Shared();
		J thread1 =new J(shared, "one ");
		J thread2 =new J(shared, "two");
		J thread3=new J(shared, "third");
		try
		{
			thread1.join();
			thread2.join();
			thread3.join();
		}
		catch(Exception e)
		{}
	}

}

class J extends Thread
{ 
   Shared shared ; 
   J(Shared shared,String tname)
   {
	   super(tname) ;
	   this.shared=shared ;
	   start();
	}
   public void run()
   {
	   shared.doWork(getName());
   }
}
class Shared
{  
	synchronized public void doWork(String tname)
	{
		System.out.println("Starting "+tname);
		System.out.println("ending "+tname);
	}
}