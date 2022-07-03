package studentclassanddetails;

import java.util.Scanner;

public class Student {
    Studentdetails studenta123=new Studentdetails();

    public  static void main(String[] args){
       Student str=new Student();

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of like if Nit then true else false");
        boolean collage=input.nextBoolean();
        str.studenta123.getStudent(collage);
    }




}
