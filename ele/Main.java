class Poe extends kylo{
    public void method2(){
        super.method2();
        System.out.print("Poe2 ");
    }
    public String toString(){
        return "Poe"+super.toString();
    }
}
class kylo extends Finn{
    public void method1(){
        System.out.print("Kylo1 ");
    }
    public String toString(){
        return "kylo";
    }
}
class Finn extends Rey{
    public void method2(){
        System.out.print("finn2 ");
        method1();
    }
}
class Rey{
    public String toString(){
        return "rey";
    }
    public void method1(){
        System.out.print("rey1 ");
    }
    public void method2(){
        System.out.print("rey2 ");
    }
}
public class Main{
    public static void main(String[] args) {
        Rey []ele={new Finn(),new Rey(),new Poe(),new kylo()};
        for(int i=0;i<ele.length;i++)
        {
            System.out.println(ele[i]);
            ele[i].method1();
            System.out.println();
            ele[i].method2();
            System.out.println();
            System.out.println("==============");
        }
    }
}