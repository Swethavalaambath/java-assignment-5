package exceptionex;
class customException1 extends Exception{
	String message;
	 customException1(String str){message=str;
}
public String toString() {
	return("Custom exception occurred"+message);
	
}
}
public class CustomException{
	public static void main(String[]args)
	{try
{throw new customException1("custom message");
}catch(customException1 e)
{System.out.println(e);
}
	}}
