package various.java.coding.examples;

public class GarbageExample {

	public static void main(String args[]){  
        /* Here we are intentionally assigning a null 
         * value to a reference so that the object becomes
         * non reachable
         */
	GarbageExample obj = new GarbageExample();  
	obj=null;  
		
        /* Here we are intentionally assigning reference a 
         * to the another reference b to make the object referenced
         * by b unusable.
         */
	GarbageExample a = new GarbageExample();
	GarbageExample b = new GarbageExample();
	b = a;
	System.gc();
   }  
   protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
