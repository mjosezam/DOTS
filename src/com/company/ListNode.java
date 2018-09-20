package com.company;

public class ListNode<T> {
    public ListNode<T> next;
    public T data;

    public ListNode(T data) {
        this.next=null;
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setData(T node){
        this.data = data;
    }
    }

