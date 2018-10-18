package myUtils;

public class SingleChain<T> {

    /**
     * 第一个子节点
     */
    private SingleChainItem<T> first;

    public SingleChainItem<T> getFirst() {
        return first;
    }

    public void setFirst(SingleChainItem<T> first) {
        this.first = first;
    }

    /**
     * 最后一个子节点
     */
    private SingleChainItem<T> last;

    public SingleChainItem<T> getLast() {
        return last;
    }

    public void setLast(SingleChainItem<T> last) {
        this.last = last;
    }

    /**
     * 长度
     */
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public SingleChain (T[] ts) {
        first = new SingleChainItem<T>(ts[0]);
        last = new SingleChainItem<T>(ts[ts.length-1]);
        length = ts.length;
        SingleChainItem<T> item = new SingleChainItem<T>();
        first.next = item;

        for(int i=1; i<ts.length;i++) {
            item.data = ts[i];
            item = item.next;
        }
    }

    @Override
    public String toString() {
        SingleChainItem node = first;
        StringBuilder S = new StringBuilder();
        for(int i=0; i<length; i++) {
            S = S.append(node.data.toString());
            node = node.next;
        }
        return S.toString();
    }
}
