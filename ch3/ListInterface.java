package tw.ch3;

import org.w3c.dom.Node;

// ListInterface介面宣告
public interface ListInterface {
	// 取得串列長度
	public int length();
	
	// 介面方法: 取得串列第i個的元素
	public Node getNode(int i);

}
