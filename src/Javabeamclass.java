public class Javabeamclass {

  int roll=123;
 String name="mahesh";
  int age=18;

    int marks=60;
    Javabaeam student2=new Javabaeam();

    public static void main(String[] args){
        Javabeamclass student1=new Javabeamclass();

        if(student1.age>=18 && student1.age<=60 && student1.marks>=60){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
        Javabeamclass newstudent=new Javabeamclass();
        newstudent.student2.setName("mahesh");
        newstudent.student2.setAge(12);
        newstudent.student2.setRoll(123);
        newstudent.student2.setMarks(60);
        if(newstudent.student2.getMarks()>=60 &&newstudent.student2.getAge()>=18 && newstudent.student2.getAge()<=60){
            System.out.println("valid student2");
        }
        else{
            System.out.println("notvalid student2");
        }


    }



}
