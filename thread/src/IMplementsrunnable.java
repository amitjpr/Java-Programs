class G implements Runnable
{  Thread t ;
    G()
    { t=new Thread(this);
      t.start();
    }
    public void run()
    {
    	System.out.println("CLass g called");
    	for(int i=0 ;i<5 ;i++)
    	{
    		System.out.println("value of i is "+i);
    	}
    }
}
class H implements Runnable
{  Thread t ;
    H()
    { t=new Thread(this);
      t.start();
    }
    public void run()
    {
    	System.out.println("CLass h called");
    	for(int i=0 ;i<5 ;i++)
    	{
    		System.out.println("value of j is "+i);
    	}
    }
}
class I implements Runnable
{  Thread t ;
    I()
    { t=new Thread(this);
      t.start();
    }
    public void run()
    {
    	System.out.println("CLass I called");
    	for(int i=0 ;i<5 ;i++)
    	{
    		System.out.println("value of k is "+i);
    	}
    }
}

public class IMplementsrunnable {

	public static void main(String[] args) {
	   G og=new G() ;
	   H oh=new H() ;
	   I oi=new I() ;
	   

	}

}
