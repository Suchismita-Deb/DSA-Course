package org.example.Week11;

import java.util.LinkedList;


public class LinkedList1 {
    private static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);l.add(30);l.add(20);l.add(40);l.add(60);l.add(98);
        System.out.println(l);

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(70);
        ListNode e = new ListNode(80);

        a.next=b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode head = a;
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

        middleOfLinkedList(a);
        middleLinkedListPointer(a);
        System.out.println(cyclicLinkedList(a));
    }

    private static boolean cyclicLinkedList(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    private static void middleLinkedListPointer(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    private static void middleOfLinkedList(ListNode a) {
        int count = 0;
        ListNode head = a;
        while(head!=null){
            count++;
            head=head.next;
        }

        int mid = 0;
        head = a;
        while(mid<=count/2){
            head = head.next;
            mid++;
            if(mid==count/2){
                System.out.println(head.data);
            }
        }
    }
}
