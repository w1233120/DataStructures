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
			System.out.println("���---------");
			System.out.println("1:�d�ߦ��Z");
			System.out.println("2:�ק令�Z");
			System.out.println("3:��ܩҦ��ǥͦ��Z");
			System.out.println("4:���}�t��");
			System.out.println("�п�J�ﶵ(1~4)");
			int input = sc.nextInt();
			
			if (input < 1 || input > 4) {
				System.out.println("�A��J���ﶵ���b�d���");
			} else {
				if (input < 3) {
					System.out.println("�п�J�ǥ;Ǹ�(1-10):");
					number = sc.nextInt() - 1;
				}
				switch (input) {
				case 1:
					grade = studentscore[number];
					System.out.println("no"+(number+1)+"�ǥͦ��Z:"+grade);
					break;
				case 2:
					grade = studentscore[number];
					System.out.println("no"+(number+1)+"�ǥͦ��Z:"+grade);
					System.out.print("�п�J�Q�n�ק諸���Z:");
					studentscore[number] = sc.nextInt();
					break;
				case 3:
					System.out.println("�ǥͦ��Z: ");
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
