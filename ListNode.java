package com.company;

public class ListNode<T> {
    public ListNode<T> next;
    public T punto1;
    public T punto2;

    public ListNode(T data1, T data2) {
        this.next=null;
        this.punto1 = data1;
        this.punto2 = data2;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public T getPunto1() {
        return punto1;
    }

    public void setPunto1(T punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(T punto2) {
        this.punto2 = punto2;
    }

    public T getPunto2() {
        return punto2;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setData(T data1, T data2) {
        this.punto1 = data1;
        this.punto2 = data2;
    }
}
