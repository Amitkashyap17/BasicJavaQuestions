import java.util.Scanner;

public class BasicQuestions {

    //Q.1 Enter 3 numbers from the user & make a function to print their average.
    static float averageThree(float a, float b, float c){
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float b = sc.nextFloat();
        System.out.print("Enter the third number : ");
        float c = sc.nextFloat();
        System.out.println("Average of given numbers is : "+averageThree(a,b,c));
    }

    //Q.2 Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumofOddNum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
                sum= sum+i;
                i++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print sum : ");
        int n = sc.nextInt();
        System.out.println("Sum of all odd numbers from 1 to "+n +" : "+sumofOddNum(n));
    }


    //Q.3 Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greatestNo(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a= sc.nextInt();
        System.out.print("Enter the second number : ");
        int b= sc.nextInt();
        System.out.println("Greatest Number is : "+greatestNo(a,b));
    }


    //Q.4 Write a function that takes in the radius as input and returns the circumference of a circle.
    public static float circleRadius(float r){
        float cum=2*3.14f*r;
        return cum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the circle radius : ");
        float r = sc.nextFloat();
        System.out.println("Circumference of a circle : "+circleRadius(r));
    }


    /*Q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not.
      A person of age > 18 is eligible to vote.*/
    public static boolean personEligible(int age){
        if(age > 18){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age= sc.nextInt();
        System.out.println(personEligible(age));
    }


    /*Q.6 Write a program to enter the numbers till the user wants and at the end
     it should display the count of positive, negative and zeros entered.*/

    public static void main(String[] args) {
        int positive=0, negative=0, zeros=0;
        System.out.println("Press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input==1){
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number>0){
                positive ++;
            }else if(number<0){
                negative ++;
            }else{
                zeros ++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive : "+positive);
        System.out.println("Negative : "+negative);
        System.out.println("Zeros : "+zeros);
    }


    /*Q.7 Two numbers are entered by the user, x and n. Write a function to find
      the value of one number raised to the power of another i.e. x^n.*/
    public static double powerofNumber(double x, double n){
        double result=Math.pow(x,n);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x : ");
        double x= sc.nextDouble();
        System.out.print("Enter the number n : ");
        double n= sc.nextDouble();
        System.out.println("Power of x^n is : "+powerofNumber(x,n));

    }

    //Q.8 Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter an integer n2 : ");
        int n2 = sc.nextInt();

        while(n1!=n2){
            if(n1>n2){
                n1 = n1-n2;
            }else{
                n2 = n2-n1;
            }
        }
        System.out.println("The Greatest Common Division : "+n1);
    }


    //Q.9 Write a program to print Fibonacci series of n terms where n is input by user :
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer n : ");
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.print(a+" ");
        if(n>1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
}
