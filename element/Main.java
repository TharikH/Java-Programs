class Eve{
    public void a(){
        System.out.print("Eve a  ");
    }
    public void b(){
        System.out.print("Eve b  ");
    }
    public String toString(){
        return "eve ts";
    }
}
class Sam extends Eve{
    public void b(){
        a();
        System.out.print("sam b  ");
    }
    public String toString(){
        return "sam ts";
    }
}
class Lucas extends Sam{
    public void a(){
        System.out.print("lucas a  ");
        System.out.print(toString()+" ");
    }
    public String toString(){
        String soup=super.toString();
        return soup+" "+soup;
    }
}
class Josh extends Lucas{
    public void b(){
        System.out.print("josh b  ");
        super.b();
    }
    public String toString(){
        return "josh ts";
    }
}
public class Main{
    public static void main(String[] args) {
        Eve ele[]={new Eve(),new Sam(),new Lucas(),new Josh()};
        for(int i=0;i<ele.length;i++)
        {
            System.out.println(ele[i]);
            ele[i].a();
            System.out.println();
            ele[i].b();
            System.out.println();
            System.out.println("=============");
        }
    }
}