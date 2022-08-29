package com.aman;
import java.util.Scanner;
public class Stack {

    public static void main(String[] args) {
	// write your code here
        Scanner x = new Scanner(System.in);
        int size = 5;
        int[] stack= new int[size];
        int top =-1;
        while(true){
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("Traverse");
            System.out.println("Quit");
            System.out.println("Enter your choice");
            int ch= x.nextInt();
            if(ch==1){
                if (top==size-1){
                    System.out.println("Stack is full");
                }else {
                    System.out.println("Enter element to push");
                    int ele = x.nextInt();
                    top++;
                    stack[top]=ele;
                    System.out.println("Element pushed");
            }
        }else if (ch == 2 ){
                if(top==-1){
                    System.out.println("Stack is Empty");
                } else {
                    System.out.println("popped :"+stack[top]);
                }
            } else if (ch == 3){
                if(top == -1){
                    System.out.println("Stack items : ");
                    for(int i =top;i>=0;i--){
                        System.out.println(stack[i]);
                    }
                }
            }else if (ch==4){
                System.out.println("Signing off");
                System.exit(1);
            }else {
                System.out.println("Invalid Choice");
            }
        }
    }
}