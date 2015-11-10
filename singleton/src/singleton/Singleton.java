package singleton;

public class Singleton {

	   private static Singleton singletonobj = new Singleton( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Singleton(){ }
	   
	   /* Static 'instance' method */
	   public static Singleton getInstance( ) {
	      return singletonobj;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton"); 
	   }
	}
