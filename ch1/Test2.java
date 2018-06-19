package tw.ch1;

import java.util.Scanner;
/*
 * 禣Α计
 * */
public class Test2 {
	public static void f(int n){
		int fn		// f(n)跑计
			,fn2	// f(n-2)跑计
			,fn1	// f(n-1)跑计
			,i
			,cont = 1;
		if(n<=1){
			System.out.println("["+n+"]");
		}else{
			fn2=0;
			fn1=1;
			System.out.print("[0][1]");
			for(i=2;i<=n;i++){
				fn=fn2+fn1;
				System.out.print("["+fn+"]");
				cont += fn;
				fn2=fn1;
				fn1=fn;
			}
			System.out.println(cont);
			System.out.println();
		}
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("叫块计兜计:");
		int n = sc.nextInt();
		f(n);
	}

}
