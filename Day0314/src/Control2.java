package a;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int gender = sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ���");
	    float height=sc.nextFloat();//float�� ���� ����ڿ��� ����
	    sc.n
		//int gender = 4;//3, 4 
		
		//gender�� 3�� ��� "����"�� ���
		//gender�� 4�� ��� "����"�� ���
		
		if ( gender == 2 || gender == 4)//���Ǹ���x
		{
			System.out.println("����");
		}
		
		else 
		{
			System.out.println("����");
		}
		
		/*
		 * score�� 68�̴�. 
		 * score�� 60�̻��̸� �հ��� ����ϰ�
		 * �׷��� ������ ���հ��� ����Ͻÿ�
		 * 
		 */
		int score2=68;
		if ( score2 >=60)		
		{
			System.out.println("�հ�");
		}
		else
		{
			System.out.println("���հ�");
			System.out.println("�̤̤̤̤̤�");
		}
		
		
		int score=86;
		
		if ( score >=90 ) //90-100
		{
			System.out.println("��");
		}
		else if ( score >=80)//0-89//80-89
		{
			System.out.println("��");
		}
		else if ( score >=70)//0-79//70-79
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("��");
		}
		
		if(score >=60)
		{
			System.out.println("�հ�");
		}
		else
		{
			System.out.println("���հ�");
		}
		System.out.println("����");
		
	}

}
