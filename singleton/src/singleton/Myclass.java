package singleton;

public class Myclass {
	private static Myclass obj;
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Myclass(){ }
	   
	   /* Static 'instance' method */
	   public static Myclass getobj( ) {
		   if(obj == null){
			   obj=new Myclass();
		   }
	      return obj;
	   }
	   /* Other methods protected by singleton-ness */
	   public void test( ) {
	      System.out.println("demoMethod for singleton"); 
	   }
}
