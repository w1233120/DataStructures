package tw.ch3;

public class SinglyLinked_Delete extends SinglyLinked {
	// �غc�l: �إ߳�V��C
	public SinglyLinked_Delete(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	// ��k: �R���`�I
	public int deleteNode(Node ptr) {
		Node current = first; // ���V�e�@�Ӹ`�I
		int value = ptr.data; // ���o�R�����`�I���
		if (isListEmpty()) {
			return -1;
		}
		if (ptr == first || ptr == null) {
			first = first.next; // �R���Ĥ@�Ӹ`�I
		} else {
			while (current.next != ptr) { // ��Mptr���e�`�I
				current = current.next;
			}
			if (ptr.next == null) {
				current.next = null; // �R���̫�@�Ӹ`�I
			} else {
				current.next = ptr.next; // �R���������`�I
			}

		}
		return value;
	}

}
