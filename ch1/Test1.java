package tw.ch1;

import java.io.*;

// ���j n����
public class Test1 {
	public static long f(int n) {
		if (n == 1) { // �פ����
			return 1;
		} else {
			return n * f(n - 1);
		}
	}
	
	public static void main(String []agrs) throws Throwable, Exception{
		//�ܼƫŧi
		int no=0;
		// �إ�BufferedReader����J��y����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(no!=-1){
			System.out.print("�п�J���h��(-1����)==>");
			System.out.flush();	// �M���w�İ�	
			// Ū���@�C�A�ഫ����ƿﶵ
			no = Integer.parseInt(in.readLine());
			if(no>0){
				// ��ƪ��I�s
				System.out.print(no+"!��ƭ�:");
				System.out.println(f(no));
			}
			
		}
		in.close(); // ������y
	}
}
