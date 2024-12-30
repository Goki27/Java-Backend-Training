import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //input 3 nos a b c  output the average of 3 numberrs


//        Scanner sc= new Scanner(System.in);
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//
//        double d=(a+b+c)/3;
//
//        System.out.print(d);
//


//2nd

//we have to find area of the square

//
//        Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the side of the Square");
//        int sideofSquare=sc.nextInt();
//
//        int areaOfSquare=sideofSquare*sideofSquare;
//
//        System.out.print("The area of the square is "+areaOfSquare);


//


        //3rd
        // enter cost of 3 items from the user using float data type a pencil a pen and an eraser.Your have to output the total cost of the items back to the
        //user as their bill
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter the cost of the Pencil ");
//        float pencil=sc.nextFloat();
//        System.out.println("Please enter the cost of the pen");
//        float  pen= sc.nextFloat();
//        System.out.println("Please enter the cost of the eraser ");
//        float eraser=sc.nextFloat();
//
//        float bill= pencil+pen+eraser;
//        System.out.println("This is your total bill "+bill);
//
//        float gst= bill*18/100;
//        System.out.println("Your gst is "+gst);
//        System.out.print("Your total bill with gst is "+(gst+bill));


//
//        //4th
//          byte b=4;
//          char c='a';
//          short s=512;
//          int i=1000;
//          float f=3.14f;
//          double d=99.644;
//
//          Double result=(f*b)+(i%c)-(d*s);
//
//          System.out.print(result);



//Revision

//
//        Topic 1: Arithmetic Operations
//       1. Multiply two integers and find the remainder when the product is divided by another number.
//        2.  Calculate the total cost of N items given the cost of one item. Ensure the result doesn’t overflow.
//        3.Add two large integers (use long to handle constraints) and print their sum.
//        4.Given the radius of a circle, calculate its circumference and area.
//        5.Calculate the average of N integers provided as input.
//         6. Convert a given speed in meters/second to kilometers/hour.
//          7.Compute the compound interest given principal, rate, and time.
//         8. Divide two numbers and print both the quotient and remainder.
//          9.Add three integers and check if their sum is divisible by 10.
//        10.Find the square root of a given number. Print only the integer part.

//1
//
//        int a=10;
//        int b=20;
//        int c=2;
//
//        int product=a*b;
//        //remainder
//        int remainder=product%c;
//
//        System.out.print(remainder);


        //2nd

        Scanner sc=new Scanner(System.in);
//        Long n=sc.nextLong();
//        Long costItem=sc.nextLong();
//
//        Long totalCost=n*costItem;
//        System.out.print(totalCost);
//

//3rd

//        long a=sc.nextLong();
//        long b=sc.nextLong();
//
//        System.out.print(b+a);
//

        //4th
//        System.out.println("Enter the Radius of the circle ");
//        int radiusCircle=sc.nextInt();
//
//        System.out.println("The circumference of the cricle is");
//        //circumference 2*PI(3.14)*r;
//        double circumference= 2*Math.PI*radiusCircle;
//        System.out.printf("%.2f%n",circumference);
//
//        //area  pi*r square
//        System.out.println("The area of the circle is ");
//        double square=Math.pow(radiusCircle,2);
//        double area=Math.PI*square;
//
//        System.out.printf("%.2f",area);
//
//


//5th
//        System.out.println("Please neter no between 1-3");
//        int n=sc.nextInt();
//
//        if(n==1){
//            System.out.println("I am inside");
//            int a=sc.nextInt();
//            double average=a/1.0;
//            System.out.print("The output is "+average);
//        }else if(n==2){
//            System.out.println("I am inside 2");
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            double average=(a+b)/2.0;
//            System.out.print("The outpuut is "+average);
//        }else if(n==3){
//            System.out.println("I am inside 3");
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            int c=sc.nextInt();
//            double average=(a+b+c)/3.0;
//            System.out.printf("The output is"+average);
//        }

        //6th question
//
//        int speed=sc.nextInt();
//
//        double speedInKM=speed*3.6;
//
//        System.out.print(speedInKM);
//


//7th

        //compound interest of the given principalte rate and time

//
//        //taking the input
//        int principle=sc.nextInt();
//        double rate=sc.nextDouble();
//        int time=sc.nextInt();
//
//        //forumula  ci=p*(1+R/100)t-p
//
//        double s=(1+rate/100);
//        double r=Math.pow(s,time);
//        double CI=principle*r-principle;
//
//        System.out.printf("The Compound interest is %.2f",CI);
//
//
//

        //8th
        //divide two nos and print both quotient and remainder
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        System.out.print("The qutoient is "+(a/b)+"%nthe reminder is"+(a%b));

//9th
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int sum=a+b+c;
//        if(sum%10==0){
//            System.out.print("This no is divisble by 10");
//        }else{
//            System.out.print("Notdivible by 10");
//        }

//
//
////10th
//       double a=sc.nextDouble();
//       double sqr=Math.sqrt(a);
//
//       System.out.printf("The square root is %.2f%n",sqr);
//
//       int intsqrt=(int)Math.sqrt(a);
//       System.out.print("The square root is "+intsqrt);
//
//
//




        //topic 2  decision making
//
//        Topic 2: Decision Making (If-Else)
//        Determine if a given number is positive, negative, or zero.
//                Find the largest of three numbers provided as input.
//        Check if a year is a leap year.
//        Write a program to check if a given character is a vowel or consonant.
//        Check if a given number is even or odd.
//                Determine if a triangle is equilateral, isosceles, or scalene based on its three sides.
//        Check if a number is divisible by both 3 and 5, only 3, only 5, or neither (FizzBuzz variant).
//                Write a program to categorize a person’s age group (e.g., child, teenager, adult, senior) based on input age.
//        Given a number, check if it is divisible by 2 and not by 3 or divisible by 3 and not by 2.
//        Compare two numbers and print:
//        "First number is greater"
//        "Second number is greater"
//        "Both are equal"

//
//        int a=sc.nextInt();
//
//        if(a>=1){
//            System.out.print("Positive no ");
//        }else if (a==0){
//            System.out.printf("0");
//        }else if(a<1){
//            System.out.printf("Negative no ");
//        }

//2nd

        //find the largest of 3 numbers provided as input
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        if(a>b && a>c){
//            System.out.print("A is greater"+a);
//        }else if(b>c){
//            System.out.print("B is greater "+b);
//        }else{
//            System.out.print("C is the greatest"+c);
//        }




        //3rd
        //check leap year

        int a=sc.nextInt();

        if(a%4==0){
            if(a%100==0 && a%400==0){
                System.out.printf("Leap year");
            }else{
                System.out.print("Not a leap");
            }
        }

    }
}