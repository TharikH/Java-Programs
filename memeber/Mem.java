class Member{
    String name;
    int age;
    String phn;
    String add;
    double sal;
    void printSal(){
        System.out.print(sal);
    }
}
class Emp extends Member{
    String spec;
    String depart;
    Emp(String s,int a,String p,String ad,double sa,String sp,String d){
        name=s;
        age=a;
        phn=p;
        add=ad;
        sal=sa;
        spec=sp;
        depart=d;
    }
    void print()
    {
        System.out.println(name+"\n"+age+"\n"+phn+"\n"+add+"\n"+sal+"\n"+spec+"\n"+depart);
    }
}
public class Mem{
    public static void main(String[] args) {
        Emp ob=new Emp("hello",23,"5678235648","kollam",123455,"ds","cse");
        ob.print();
    }
}