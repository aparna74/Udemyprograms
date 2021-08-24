package Exceptions;

import java.util.Scanner;

public class Teststack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            int size = sc.nextInt();

            sc.close();
            stack sta = new stack(size);

            for (int i = 0; i < 5; i++)

                sta.push(i);
            for (int i = sta.top; i >= 0; i--)
                System.out.println(sta.pop());
        }catch(stack_undeflow_exception e){
        System.out.println(e.getMessage());
        }catch(stack_overflow_exception e) {
            System.out.println(e.getMessage());
        } catch (NegativeArraySizeException n) {
            System.out.println("size of stack should not be negative");
        }
    }
}

