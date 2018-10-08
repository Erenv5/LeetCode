package tree;

public class MyBinaryTree<T> {
    private T data;
    private MyBinaryTree leftNode;
    private MyBinaryTree rightNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyBinaryTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(MyBinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    public MyBinaryTree getRightNode() {
        return rightNode;
    }

    public void setRightNode(MyBinaryTree rightNode) {
        this.rightNode = rightNode;
    }
}
