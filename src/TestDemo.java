/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-09
 * Time:18:51
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();

        myDoubleLinkedList.addLast(10);
        myDoubleLinkedList.addLast(10);
        myDoubleLinkedList.addLast(10);
        myDoubleLinkedList.display();
        myDoubleLinkedList.addIndex(2,99);
        myDoubleLinkedList.display();
        /*myDoubleLinkedList.remove(30);
        myDoubleLinkedList.display();*/
        myDoubleLinkedList.removeAllKey(10);
        myDoubleLinkedList.display();
    }
}
