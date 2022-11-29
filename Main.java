package OOP;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]=new char[5];
		MyArray e1 = new MyArray();
		Scanner read=new Scanner(System.in);
		arr[0]='a';
		arr[1]='b';
		arr[2]='c';
		arr[3]='d';
		arr[4]='e';
		for(int i=0;i<5;i++)
		{
	
			e1.c[i]=arr[i];
		}
		
		
		boolean f=e1.Compare("dania");
		System.out.println(f);
		char y=e1.CharAt(0);
		System.out.println(y);
		int t =e1.lastApperance('b');
		System.out.println(t);
		e1.replaceAll('d', 'w');
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
			
	}

}
