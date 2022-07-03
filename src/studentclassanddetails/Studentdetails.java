package studentclassanddetails;

import java.util.Scanner;

public class Studentdetails {
    int roll;

    String name;
    String address;
    String Collagename;
    void createstudent(String name,int roll,String address){
        this.name=name;
        this.roll=roll;
        this.address=address;

    }
    void createstudent1(String name,int roll,String address,String collagename){
        this.name=name;
        this.roll=roll;
        this.address=address;
        this.Collagename=collagename;

    }
    void printdetails(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(address);


    }
    void printdetails1(){
        System.out.println(this.name);
        System.out.println(roll);
        System.out.println(address);
        System.out.println(Collagename);

    }
    void getStudent(boolean isFromNIT){
        if(isFromNIT==true){
            Scanner input=new Scanner(System.in);
            System.out.println("enter name");
            String name1=input.nextLine();
            System.out.println("Enter roll number");
            int roll1=input.nextInt();
            System.out.println(" Enter address");
            String address1=input.nextLine();


//            Studentdetails studentdata=new Studentdetails();
           createstudent(name1,roll1,address1);
            printdetails();



        }
        else{
            Scanner input=new Scanner(System.in);
            System.out.println("enter name");
            String name1=input.nextLine();
            System.out.println("Enter roll number");
            int roll1=input.nextInt();
            Scanner input1=new Scanner(System.in);
            System.out.println("address");
            String address1=input1.nextLine();
            System.out.println("enter collagename");
            String collagename1=input1.nextLine();


            Studentdetails studentdata=new Studentdetails();
            studentdata.createstudent1(name1,roll1,address1,collagename1);
            printdetails1();

        }

    }
}
