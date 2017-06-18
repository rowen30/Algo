/**
 * Created by sumit on 21/5/17.
 */
public class SList<T> {
    Node start;
    Node end;
    int count;

    public T get(Node<T> node){
        return node.element;
    }

    public boolean add(T ele){
        if(count == 0) {
            start = new Node<T>();
            start.element = ele;
            count++;
            return true;
        }
        return false;
    }

    static class Node<T>{
        T element;
    }
}
