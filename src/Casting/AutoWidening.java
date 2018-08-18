package Casting;

public class AutoWidening {
	
	    static double methodOne(int i)
	    {
	        double j = i;     //int is auto widened to long
	        return j;       //long is auto widened to float
	    }
	 
	    public static void main(String[] args)
	    {
	        byte b = 10;
	        short s = b;      //byte is auto widened to short
	        double d = methodOne(s);    //short is auto widened to int and float to double
	        System.out.println(d);
	    }
	
}
