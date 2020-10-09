/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-09
 * Time:18:50
 **/


class Node{
    private Node prev;
    private Node next;
    private int data;

    public Node(int data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class MyDoubleLinkedList {

    public Node head;

    public MyDoubleLinkedList() {
        this.head = head;
        this.tail = tail;
    }

    public Node tail;
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
           this.head = node;
           this.tail = node;
           return;
           }
           node.setNext(this.head);
           this.head.setPrev(node);
            this.head = node;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+"   ");
            cur = cur.getNext();
        }
        System.out.println();
    }

    public void addLast(int data){

        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.setNext(node);
        node.setPrev(this.tail);
        tail = node;
    }
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if (cur.getData() == key){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    public int size(){
        if (this.head == null){
            return 0;
        }
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    private boolean checkPos(int pos){
        if (pos < 0 || pos > size()){
            return true;
        }
        return false;
    }
    private Node searchIndex(int pos){
        Node cur = this.head;
        while(pos > 0){
            cur = cur.getNext();
            pos--;
        }
        return cur;
    }
    public void addIndex(int pos,int data){
        if (checkPos(pos)){
            return;
        }
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = searchIndex(pos);
        node.setNext(cur);
        cur.getPrev().setNext(node);
        node.setPrev(cur.getPrev());
        cur.setPrev(node);

    }
    public void remove(int toRemove){
        Node cur = this.head;
        while(cur != null){
            if (cur.getData() == toRemove){
                if (this.head.getData() == toRemove){
                    this.head = this.head.getNext();
                    this.head.setPrev(null);
                    return;
                }else {
                    cur.getPrev().setNext(cur.getNext());
                    if (cur.getNext() != null){
                        cur.getNext().setPrev(cur.getPrev());
                    }else {
                        this.tail = cur.getPrev();
                    }

                }
            }
            cur = cur.getNext();
        }
    }
    public void removeAllKey(int toRemove){
        Node cur = this.head;
        while(cur != null){
            if (cur.getData() == toRemove){
                if (this.head.getData() == toRemove){
                    this.head = this.head.getNext();
                    if (this.head != null){
                        this.head.setPrev(null);
                    }

                }else {
                    cur.getPrev().setNext(cur.getNext());
                    if (cur.getNext() != null){
                        cur.getNext().setPrev(cur.getPrev());
                    }else {
                        this.tail = cur.getPrev();
                    }

                }
            }
            cur = cur.getNext();
        }

    }
}
