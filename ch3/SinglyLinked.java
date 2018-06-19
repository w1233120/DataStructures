package tw.ch3;

// ��V�쵲��C
public class SinglyLinked extends List {
	// �غc�l: �إ߳�V��`��C
	public SinglyLinked(int[] array) {
		Node newnode;
		first = null; // ��l�ƶ}�Y����
		for (int i = 0; i < array.length; i++) {
			newnode = new Node(array[i]); // �إ߸`�I
			newnode.next = first; // �s�`�I���Ĥ@�Ӹ`�I
			first = newnode; // ���]�}�Y������
		}
	}

	// ��k: �ˬd��C�O�_����
	@Override
	public boolean isListEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	// ��k: ��ܦ�C���
	@Override
	public void printList() {
		Node current = first; // ���w�ثe��C���� current = newnode;
		while (current != null) {
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println();

	}

	// ��k: �M��`�I���
	public Node searchNode(int searchData) {
		Node current = first; // �ثe��C�Ĥ@�ӫ���
		while (current != null) { // �j�M�D�j��
			if (current.data == searchData) { // �ˬd�O�_�����
				return current; // �^�Ǹ��
			} else {

				current = current.next; // �U�@�Ӹ`�I
			}
		}
		return null; // �S�����

	}

	// ��k: �R���`�I
	public int deleteNode(Node ptr) {
		Node current = first; // ���V�e�@�Ӹ`�I
		int value = ptr.data; // ���o�R�����`�I���
		if (isListEmpty()) {
			return -1;
		}
		if (ptr == first || ptr == null) {
			first = first.next;
		} else {
			while (current.next != ptr) {
				current = current.next;
			}
			if (ptr.next == null) {
				current.next = null;

			} else {
				current.next = ptr.next;
			}

		}
		return value;
	}

	// ��k : ���J�`�I
	public void inserNode(Node ptr, int data) {
		Node newnode = new Node(data);
		if (ptr == null) {
			newnode.next = first; // �s�`�I������C���}�l
			first = newnode;
		} else if (ptr.next == null) { // ��C�̫�@�Ӹ`�I
			ptr.next = newnode; // �̫�@�Ӹ`�I��next���Vnewnode
			newnode.next = null; // newnode.next���Vnull
		} else {
			newnode.next = ptr.next; // newnode.next���Vptr���U�@�Ӹ`�I
			ptr.next = newnode; // ptr���U�@�Ӹ`�I�ܦ�newnode
		}

	}

}
