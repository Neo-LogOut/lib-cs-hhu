public class Test {
    public static void main(String[] args) {
//    	int intValue=100;
//    	long long_Value=intValue;
    	double doubleValue=1234567890;
    	float floatValue=(float)doubleValue;
    	System.out.println(floatValue);//1.23456794E9
	
    	int X=100;
    	int Y=200;
    	System.out.println("X+Y="+X+Y);
    	System.out.println(X+Y+"=X+Y");

    	String string="";
    	double d1=1000.123;
    	double d2=1000.123;
    	if(Math.abs(d2-d1)<1e-10){
    		string = "d1 is equal to d2";
    	}
    	else{
    		string = "d1 is not equal to d2";
    	}
    	System.out.println(string);
  }
}