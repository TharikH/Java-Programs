class Employee{
    private int id;
    private String name;
    private String designation;
    private int ssno;
    private int age;
    private double salary;
    static private int idCounter=0;
    void setData(String n,String d,int s,int a,double sa){
        name=n;
        designation=d;
        ssno=s;
        age=a;
        salary=sa;
        idCounter++;
        id=idCounter;
    }
    // Employee getData(){
    //     return(new Employee(id,name,designation,ssno,age,salary));
    // }
    Employee(String n,String d,int s,int a,double sa){
        setData(n,d,s,a,sa);
    }
    static int getidCount(){
        return idCounter;
    }
}
public class Emp{
    public static void main(String[] args)
    {
         Employee emp1=new Employee("vybhgv","idbhgvf",56,76,899.0);
         System.out.println("value of idCounter: "+Employee.getidCount());
         Employee emp2=new Employee("poiiuy","idkimujn",63,45,259.0);
         System.out.println("value of idCounter: "+Employee.getidCount());
         Employee emp3=new Employee("lkjkjhg","idxcv",13,74,456.0);
         System.out.println("value of idCounter: "+Employee.getidCount());
         Employee emp4=new Employee("lkjkjhg","idxcv",13,74,456.0);
         System.out.println("value of idCounter: "+Employee.getidCount());
         Employee emp5=new Employee("lkjkjhg","idxcv",13,74,456.0);
         System.out.println("value of idCounter: "+Employee.getidCount());
    }
} 