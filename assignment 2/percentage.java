import java.util.Scanner;
import java.util.*;
class percentage{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int s1,s2,s3,s4;
System.out.println("Enter the Subject S1 no: ");
s1 = sc.nextInt();
System.out.println("Enter the Subject S2 no: ");
s2 = sc.nextInt();
System.out.println("Enter the Subject S3 no: ");
s3 = sc.nextInt();
System.out.println("Enter the Subject S4 no: ");
s4 = sc.nextInt();
System.out.println("Enter the Subject S5 no: ");
int s5 = sc.nextInt();
float percentage = (s1+s2+s3+s4+s5)*100/500;

if(percentage>75){
System.out.print("A grade");

System.out.print(percentage);}
else if(percentage>70){

System.out.println("B grade");
System.out.println(percentage);}
else if (percentage>65){
System.out.println("C grade");
System.out.println(percentage);
}
else{
System.out.println("C grade");
System.out.println(percentage);}
}
}