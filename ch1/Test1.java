package tw.ch1;

import java.io.*;

// 遞迴 n階乘
public class Test1 {
	public static long f(int n) {
		if (n == 1) { // 終止條件
			return 1;
		} else {
			return n * f(n - 1);
		}
	}
	
	public static void main(String []agrs) throws Throwable, Exception{
		//變數宣告
		int no=0;
		// 建立BufferedReader的輸入串流物件
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(no!=-1){
			System.out.print("請輸入階層數(-1結束)==>");
			System.out.flush();	// 清除緩衝區	
			// 讀取一列，轉換成整數選項
			no = Integer.parseInt(in.readLine());
			if(no>0){
				// 函數的呼叫
				System.out.print(no+"!函數值:");
				System.out.println(f(no));
			}
			
		}
		in.close(); // 關閉串流
	}
}
