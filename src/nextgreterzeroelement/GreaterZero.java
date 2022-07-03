package nextgreterzeroelement;

import java.util.Scanner;

public class GreaterZero {

            public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.println("ENter number");

                int number=input.nextInt();
                if(number>=0){
                    if(number%10==0){
                        System.out.println(number);
                    }
                    else {
                        while (number % 10 != 0) {
                            number++;
                        }
                        System.out.println(number);
                    }
                }
                else{
                    System.out.println("Eroor");
                }

            }
}
