class Employee{
    private int id;
    private String name;
    private String designation;
    private int ssno;
    private int age;
    private double salary;
    void setData(int i,String n,String d,int s,int a,double sa){
        id=i;
        name=n;
        designation=d;
        ssno=s;
        age=a;
        salary=sa;
    }
    Employee getData(){
        return(new Employee(id,name,designation,ssno,age,salary));
    }
    Employee(int i,String n,String d,int s,int a,double sa){
        setData(i,n,d,s,a,sa);
    }
    static Employee findMin(Employee a,Employee b,Employee c){
        if(a.id<=b.id && a.id<=c.id)
            return a;
        else if(b.id<=a.id && b.id<=c.id)
            return b;
        else
            return c;
    }
    public String getid(){
        return("id="+id);
    }
}
public class Emp{
    public static void main(String[] args)
    {
         Employee emp1=new Employee(37,"vybhgv","idbhgvf",56,76,899.0);
         Employee emp2=new Employee(1,"poiiuy","idkimujn",63,45,259.0);
         Employee emp3=new Employee(43,"lkjkjhg","idxcv",13,74,456.0);
         Employee employeeres=Employee.findMin(emp1,emp2,emp3);
         System.out.println(employeeres.getid());
    }
} 
