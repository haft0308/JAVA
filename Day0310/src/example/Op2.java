package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j = 5;
		System.out.println(++i);//i=i+1;
								//	System.out.println(i);
									
		System.out.println(i);//6
		
		System.out.println(--j);	//j=j-1;
								//System.out.println(j);
								
		System.out.println(j);//4
		
		System.out.println(i+"+"+j);//6+4
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);//byte+byte->int+int=int
		System.out.println(c);
		
	}

}
