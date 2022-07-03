package democlss;

public class DemoClass {
    void demo(){
        System.out.println("hello welcome to democlass");
    }
    String demo(String name){
        return name;
    }
    int demo(int x){
        return x;
    }
    float demo(float x){
        return x;
    }
    void printdemoclass(String name,int x,float y){
        demo();

        System.out.println(demo(name));
        System.out.println(demo(x));
        System.out.println(demo(y));

    }

  public static void main(String[] args){
        DemoClass newdemo=new DemoClass();
        newdemo.printdemoclass("mahesh",12,12.34f);
    }
}
