class Parent{
    void f()
    {
        System.out.println("i am parent");
    }
}
class Child extends Parent{
    void f1()
    {
        System.out.println("i am child");
    }
}
public class Inherit{
    public static void main(String[] args) {
        Parent ob1 =new Parent();
        Child ob2=new Child();
        ob1.f();
        ob2.f1();
        ob2.f();
    }
}