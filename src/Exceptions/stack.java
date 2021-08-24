package Exceptions;

 public class stack {
     int[] stak;
     int top;
     int size = 10;

     stack() {
         stak = new int[size];
         top = -1;
     }

     stack(int size) {
         this.size = size;
         stak = new int[size];
         top = -1;
     }

     void push(int num) throws stack_overflow_exception {
         if (top ==size-1) throw new stack_overflow_exception();
         stak[++top] = num;

     }

     int pop() throws stack_undeflow_exception {
        if(top==-1) throw new stack_undeflow_exception();
         return (stak[top--]);

     }
 }
 class stack_undeflow_exception extends Exception{
     public String getMessage(){
             return("stack is empty");

         }
     }

 class stack_overflow_exception extends Exception{
    public String getMessage(){

             return("Stack is full");

         }
     }

