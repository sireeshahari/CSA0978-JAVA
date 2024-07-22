import java.util.Scanner;
class Avgofpos
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
int i=0,j=0;
int s1=0,s2=0;
int n;
System.out.print("enter the numbers:");
while(true)
{
 n=scanner.nextInt();
if(n==-1)
{
break;
}
if(n>0)
{
i++;
s1+=n;
}
else
 {
j++;
s2+=n;
}
}
System.out.println("Number of positive integers:"+i);
System.out.println("Number of negative integers:"+j);
if(i>0)
{
double pos =(double) s1/i;
System.out.println("The average of positive numbers:"+pos);
}
if(j>0)
{
double neg =(double) s2/j;
System.out.println("the average of negative numbers:"+neg);
}
}
}



