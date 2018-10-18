package myUtils;

/**
 * 单向链表
 */
public class SingleChainItem<T> {
    T data;
    SingleChainItem<T> next;

    SingleChainItem() {
        data = null;
        next = new SingleChainItem<T>();
    }

    SingleChainItem(T t) {
        data = t;
        next = new SingleChainItem<T>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SingleChainItem<T> next() {
        return next;
    }

    public void setNext(SingleChainItem<T> next) {
        this.next = next;
    }
}
