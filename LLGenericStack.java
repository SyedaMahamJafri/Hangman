/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT_DS;

/**
 *
 * @author LAPTOP
 */
class StackNode<T>{
    T data;
    StackNode<T> next;
    StackNode(T data){
        this.data = data;
    }

}

public class LLGenericStack<T> {
    StackNode<T> head;
    int size = 0;


    public boolean isempty() {
        return (head == null);
    }

    public T peek() {
        if (size == 0) {
            System.out.println("The stack is empty");
        }

        return head.data;
    }

    public void push(T data) {
        StackNode<T> n = new StackNode(data);
        if (isempty() == true) {
            head = n;
            size++;
        } else {
            // initially n.next is null
            n.next = head;
            //giving top the addressof new node
            head = n;
            size++;
        }

    }

    public T pop() {
        StackNode<T> temp = head;
        if (isempty() == true) {
            System.out.println("Stack underflow. Pop function is not possible");
        } else {
            head = head.next;
            size--;
        }
        return temp.data;
    }

    public String toString() {
        StackNode<T> temp = head;
        String str = "";
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return str;
    }
}
