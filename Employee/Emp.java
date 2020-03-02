class Employee{
    private int id;
    private String name;
    private String designation;
    private int ssno;
    private int age;
    private double salary;
    void setdata(int i,String n,String d,int s,int a,double sa){
        id=i;
        name=n;
        designation=d;
        ssno=s;
        age=a;
        salary=sa;
    }
    Employee getdata(){
        return(new Employee(id,name,designation,ssno,age,salary));
    }
    Employee(int i,String n,String d,int s,int a,double sa){
        setdata(i,n,d,s,a,sa);
    }
    static double findAvg(Employee a,Employee b){
        return((a.id+b.id)/2.0);
    }
}
public class Emp{
    public static void main(String[] args)
    {
         Employee emp1=new Employee(63,"vybhgv","idbhgvf",56,76,899.0);
         Employee emp2=new Employee(9,"poiiuy","idkimujn",63,45,259.0);
         double employeeres=Employee.findAvg(emp1,emp2);
         System.out.println(employeeres);
    }
} 
