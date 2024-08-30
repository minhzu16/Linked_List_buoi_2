package mylinkedlist;

import java.util.LinkedList;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    // 2. public void display()
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // 3. public void deleteFirst()
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }



    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        //3->2->1
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        //5->6->7
        linkedList.add(4,3);
        //4
        System.out.println("Chuỗi :" );
        linkedList.display();

        System.out.println("Độ dài chuỗi :" + linkedList.length());

        linkedList.deleteFirst();
        System.out.println("Chuỗi sau khi loại phần tử đầu:" );
        linkedList.display();


    }

}
