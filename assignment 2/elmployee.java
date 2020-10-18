import java.util.*;
import java.util.Scanner;
class employee{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Name: ");
String name = sc.nextLine();
System.out.println("Enter Employee date of birth: ");
int date = sc.nextInt();
System.out.println("Enter Employee birth month: ");
int month = sc.nextInt();
System.out.println("Enter Employee Birth year: ");
int year = sc.nextInt();
System.out.println("Enter Employee Monthly salary: ");
int salary = sc.nextInt();
int age = 2020 - year;
int annualSalary = salary *12;
System .out.println("name: "+ name);
System.out.println("Age: "+ age);
System.out.println("Annual Salary : "+ annualSalary);

if (annualSalary >=500000 ){
int texAmount = (annualSalary * 20)/100;
System.out.println("tex: " +texAmount);
}

else if (annualSalary >=400000 ){
int texAmount = (annualSalary * 15)/100;
System.out.println("tex: " +texAmount);
}

else if (annualSalary >=300000 ){
int texAmount = (annualSalary * 10)/100;
}
else if (annualSalary >=200000 ){
int texAmount = (annualSalary * 5)/100;
System.out.println("tex: " +texAmount);
}
}
}