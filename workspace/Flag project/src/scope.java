

	public class scope 
{
	  global int x = 4;

	    public void doublex() {
		    
	    	x = x * 2;
	    }

	    public void squarex() {
		    x = x * x;
	    }

	    public int x() {
		    return x;
	    }
 public static void main(String []args)
 {
	 
	 scope scope1= new scope();
	 scope1.doublex();
	 System.out.println(scope1.x()); 
 }
}

