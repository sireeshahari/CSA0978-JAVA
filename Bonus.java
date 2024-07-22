import java.util.Scanner;
class Bonus
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the grade of the employee:");
        char grade=scanner.next().charAt(0);
double bonus=0;
System.out.print("enter the salary of the employee:");
int salary=scanner.nextInt();
if(grade=='A')
{
bonus=salary*0.05;
if(salary<1000)
{
bonus+=salary*0.02;
}
}else if(grade=='B')
{
bonus=salary*0.01;
if(salary<1000)
{
bonus+=salary*0.02;
}
}else{
System.out.print("enter thevalid grade:");
return;
}
System.out.println("Salary:"+salary);
System.out.println("Bonus:"+bonus);
System.out.println("total to be paid:"+(salary+bonus));
}
}