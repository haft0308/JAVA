package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 12, b=13;
		float c = 0;
		c = (a+b)/2;//25/2=12.5
		System.out.println(c);
		
		char c1='A';
		System.out.println(c1);
		
		//char c2 = ++c1;//c1+1;
		char c2 = (char)(c1+2);//char+int->int+int
		System.out.println(c2);
		
		
		int i = 7;
		System.out.println(i>3 && i<5);
		
	}

}
