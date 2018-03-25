class D extends Thread{
	public void run()
	{
		System.out.println("class a called ");
		try {
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of i is "+i);
		     sleep(1000);
		}
		}catch(Exception e )
		{}
	}
}
class E extends Thread{
	public void run()
	{
		System.out.println("class B called ");
		try {
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of j is "+i);
		    sleep(1000);
		}
		}catch(Exception e )
		{}
	}
}
class F extends Thread{
	public void run()
	{
		System.out.println("class C called ");
		try{
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of k is "+i);
		    sleep(1000);
		}
		}catch(Exception e )
		{}
	}
}



public class Multithreadsleep {

	public static void main(String[] args) {
		D oa=new D();
		E ob=new E();
		F oc=new F();
		oa.start();
		ob.start();
		oc.start();
		System.out.println("class mainthread called ");
		try {
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of mainthread is "+i);
			Thread.sleep(1500);
		  }
		}
		catch(Exception e )
		{}
	}

}
