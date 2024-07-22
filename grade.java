import java.util.Scanner;
class grade{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("enter the marks for sub1:");
int a1=scanner.nextInt();
System.out.print("enter the marks for sub2:");
int a2=scanner.nextInt();
System.out.print("enter the marks for sub3:");
int a3=scanner.nextInt();
System.out.print("enter the marks for sub4:");
int a4=scanner.nextInt();
int total=a1+a2+a3+a4;
float agg=total/4f;
System.out.println("Total:"+total);
System.out.println("Aggregate:"+agg);
if(agg>75)
{
System.out.println("DISTINTION");
}
else if(agg>=60 && agg<75)
{
System.out.println("First Division");
}else if(agg>=50 && agg<60)
{
System.out.println("Second division");
}
else if(agg>=40 && agg<50)
{
System.out.println("Thrid division");
}else {
System.out.println("Fail");
}
}
}
