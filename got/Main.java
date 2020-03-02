class Bri extends Obe{
    public void a(){
        System.out.print("Bri-a ");
    }
}
class Arya{
    public void a(){
        System.out.print("Arya-a ");
    }
    public void b(){
        a();
        System.out.print("Arya-b ");
    }
}
class Tyrion extends Arya{
    public void a(){
        super.a();
        System.out.print("Tyrin-a ");
    }
}
class Obe extends Arya{
    public void b(){
        System.out.print("Obe-b ");
        super.b();
    }
    public String toString(){
        return "Obe";
    }
}
public class Main{
    public static void main(String[] args) {
        Arya []throne={new Obe(),new Arya(),new Bri(),new Tyrion()};
        for(int i=0;i<throne.length;i++){
            throne[i].a();
            System.out.println();
            System.out.println(throne[i]);
            throne[i].b();
            System.out.println();
            System.out.println();
            System.out.println("============================");

        }
    }
}