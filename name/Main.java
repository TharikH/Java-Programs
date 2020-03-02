class George extends Ela{
    public void method1(){
        System.out.print("george 1");
    }
}
class Jerry{
    public void method1(){
        System.out.print("jerry 1");
    }
    public void method2(){
        System.out.print("jerry2");
    }
    public String toString(){
        return "Jerry";
    }
}
class Ela extends Kramer{
    public String toString(){
        return "Elaine"+super.toString();
    }
}
class Kramer extends Jerry{
    public void method1(){
        super.method1();
        System.out.print("Kramer 1");
    }
    public void method2(){
        System.out.print("Kramer 2");
        method1();
    }
    public String toString(){
        return "kramer";
    }
}
public class Main{
    public static void main(String[] args) {
        Jerry []sien={new George(),new Kramer(),new Jerry(),new Ela()};
        for(int i=0;i<sien.length;i++){
            sien[i].method1();
            System.out.println();
            sien[i].method2();
            System.out.println();
            System.out.println(sien[i]);
            System.out.println();
            System.out.println("==============");
        }
    }
}