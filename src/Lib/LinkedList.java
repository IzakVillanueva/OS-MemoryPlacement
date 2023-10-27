/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izak
 */
public class LinkedList {
    Node head;
    
    public void insert(Job data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAtStart(Job data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    public void insertAt(int index, Job data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index==0){
            insertAtStart(data);
        }else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
    public void deleteAt(int index){
        if(index==0){
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
    
    public Job getNext(int index){
        Node node = head;
        if(node.next == null){
            return null;
        }
        if(index == 0){
            return node.next.data;
        }
        for(int i=0; i<=index; i++){
            if(node.next != null){
                node = node.next;
            } else{
                return null;
            }
        }
        return node.data;
    }
    
    public void mergeSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;
        
        LinkedList list1 = new LinkedList();
        list1.head = head;

        LinkedList list2 = new LinkedList();
        list2.head = nextOfMiddle;

        list1.mergeSort();
        list2.mergeSort();

        this.head = sortedMerge(list1.head, list2.head);
    }

    private Node sortedMerge(Node a, Node b) {
        if (a == null && b == null) {
            return null;
        }

        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.data.getSize() >= b.data.getSize()) {
            a.next = sortedMerge(a.next, b);
            return a;
        } else {
            b.next = sortedMerge(a, b.next);
            return b;
        }
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public List<Job> showMemory(){
        List<Job> mem = new ArrayList<>();
        Node node = head;
        
        while(node!=null){
            mem.add(node.data);
            //System.out.println("in sheeowmem"+node.data.isHole());
            node = node.next;
        }
        //System.out.println("in showmem"+node.data.isHole());
        
        return mem;
    }
    
    public void printMemory(){
        Node node = head;
        
        while(node!=null){
            System.out.print(node.data.getName() + " - ");
            System.out.println(node.data.getSize());
            node = node.next;
        }
    }
}
