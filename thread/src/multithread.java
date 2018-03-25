class A extends Thread{
	public void run()
	{
		System.out.println("class a called ");
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of i is "+i);
		}
	}
}
class B extends Thread{
	public void run()
	{
		System.out.println("class B called ");
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of j is "+i);
		}
	}
}
class C extends Thread{
	public void run()
	{
		System.out.println("class C called ");
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of k is "+i);
		}
	}
}

public class multithread {

	public static void main(String[] args) {
		A oa=new A();
		B ob=new B();
		C oc=new C();
		oa.start();
		ob.start();
		oc.start();
		System.out.println("class mainthread called ");
		for (int i=0 ; i<5 ;i++)
		{ 
			System.out.println("Value of mainthread is "+i);
		}
	}

}
