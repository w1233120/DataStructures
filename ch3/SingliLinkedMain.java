package tw.ch3;

import java.util.Scanner;

public class SingliLinkedMain {

	public static void main(String[] args) {
		int temp =0;
		int [] data = {1,2,3,4,5,6,7,8,9,10};
		
		SinglyLinked s1 = new SinglyLinked(data);
		System.out.print("��Ӫ���C: ");
		s1.printList();
		System.out.println("��C�O�Ū�?:"+s1.isListEmpty());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��J�j�M���l�H�s��==>");
		temp = sc.nextInt();
		if(temp>=1){
			if(s1.searchNode(temp)!=null){
				System.out.println("��C�]�t�`�I["+temp+"]");
			}else{
				System.out.println("��C���]�t�`�I["+temp+"]");
			}
		}
		
	}

}
