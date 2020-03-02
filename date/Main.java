class Date{
    int month;
    int day;
    int date[]={31,28,31,30,31,30,31,31,30,31,30,31};
    Date(int m,int d){
        month=m;
        day=d;
    }
    public int daysInMonth(){
        return date[month-1];
    }
    public int getMonth(){
        return month;
    }
    boolean isDayFull(){
        return(day==date[month-1]);
    }
    boolean isMonthFull(){
        return(month==12);
    }
    public void nextDay(){
        if(isDayFull())
        {
            day=1;
            if(isMonthFull())
            {
                month=1;
            }
            else
            {
                month++;
            }
        }
        else{
            day++;
        }
    }
    public String toString(){
        return day+"/"+month;
    }
    public int absoluteDay(){
        int s=0;
        for(int i=0;i<month-1;i++)
        {
            s+=date[i];
        }
        s+=day;
        return s;
    }
}
public class Main{
    public static void main(String[] args){
        Date jan1=new Date(1,1);
        System.out.println(jan1.absoluteDay());
        Date jan4=new Date(1,4);
        System.out.println(jan4.absoluteDay());
        Date feb1=new Date(2,1);
        System.out.println(feb1.absoluteDay());
        Date mar10=new Date(3,10);
        System.out.println(mar10.absoluteDay());
        Date sep19=new Date(9,19);
        System.out.println(sep19.absoluteDay());
        Date dec31=new Date(12,31);
        System.out.println(dec31.absoluteDay());
    }
}