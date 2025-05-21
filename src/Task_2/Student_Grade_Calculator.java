package Task_2;
import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("English: ");
        double a = sc.nextDouble();
        System.out.print("Math: ");
        double b = sc.nextDouble();
        System.out.print("Physics: ");
        double c = sc.nextDouble();
        System.out.print("Biology: ");
        double d = sc.nextDouble();
        double t = (a+b+c+d);
        System.out.println("Total makrs: "+t);
        double p = (a+b+c+d)/4;
        System.out.println("Percentage: "+p);
        if(p <= 20){
            System.out.println("Grade: Very Poor");
        }
        if (21 <= p && p<= 40){
            System.out.println("Grade: Poor");
        }
        if (41 <= p && p <= 60){
            System.out.println("Grade: Average");
        }
        if (61 <= p && p <= 80){
            System.out.println("Grade: Good");
        }
        if (81 <= p && p <= 90){
            System.out.println("Grade: Very Good");
        }
        if (91 <= p && p <= 100){
            System.out.println("Grade: Excellent");
        }
    }
}
