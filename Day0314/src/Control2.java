package a;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		int gender = sc.nextInt();
		
		System.out.println("키를 입력하세요");
	    float height=sc.nextFloat();//float의 값을 사용자에게 받음
	    sc.n
		//int gender = 4;//3, 4 
		
		//gender가 3인 경우 "남자"로 출력
		//gender가 4인 경우 "여자"로 출력
		
		if ( gender == 2 || gender == 4)//조건만족x
		{
			System.out.println("여자");
		}
		
		else 
		{
			System.out.println("남자");
		}
		
		/*
		 * score가 68이다. 
		 * score가 60이상이면 합격을 출력하고
		 * 그렇지 않으면 불합격을 출력하시오
		 * 
		 */
		int score2=68;
		if ( score2 >=60)		
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
			System.out.println("ㅜㅜㅜㅜㅜㅜ");
		}
		
		
		int score=86;
		
		if ( score >=90 ) //90-100
		{
			System.out.println("수");
		}
		else if ( score >=80)//0-89//80-89
		{
			System.out.println("우");
		}
		else if ( score >=70)//0-79//70-79
		{
			System.out.println("미");
		}
		else
		{
			System.out.println("가");
		}
		
		if(score >=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		System.out.println("종료");
		
	}

}
