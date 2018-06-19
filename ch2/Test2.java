package tw.ch2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int[] studentscore = { 50, 78, 87, 62, 32, 50, 88, 90, 100 };
		int number = 0;
		int grade;

		boolean doit = true;

		Scanner sc = new Scanner(System.in);

		while (doit) {
			System.out.println("選單---------");
			System.out.println("1:查詢成績");
			System.out.println("2:修改成績");
			System.out.println("3:顯示所有學生成績");
			System.out.println("4:離開系統");
			System.out.println("請輸入選項(1~4)");
			int input = sc.nextInt();
			
			if (input < 1 || input > 4) {
				System.out.println("你輸入的選項不在範圍裡");
			} else {
				if (input < 3) {
					System.out.println("請輸入學生學號(1-10):");
					number = sc.nextInt() - 1;
				}
				switch (input) {
				case 1:
					grade = studentscore[number];
					System.out.println("no"+(number+1)+"學生成績:"+grade);
					break;
				case 2:
					grade = studentscore[number];
					System.out.println("no"+(number+1)+"學生成績:"+grade);
					System.out.print("請輸入想要修改的成績:");
					studentscore[number] = sc.nextInt();
					break;
				case 3:
					System.out.println("學生成績: ");
					for(int i=0;i<studentscore.length;i++){
						System.out.println("no"+(i+1)+":"+studentscore[i]+" ");
					}
					System.out.println();
					break;
				case 4:
					doit = false;
					break;
					
				
				}
			}
		}

	}

}
