


public class Node<T> {

    T data;
    Node<T> next;


    public static void main(String[] args) {
        Node<Integer> intNode = new Node<>(5);
        System.out.println(intNode.data);
        Node<String> strNode = new Node<>("Nodey");
        System.out.println(strNode.data);
        System.out.println(intNode.data);
    }

    Node(T obj) {
        this.data = obj;
        this.next = null;
    }
}
