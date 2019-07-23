import java.util.Scanner; //java.util

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main calculation = new Main();
        calculation.addition();
        calculation.substraction();
        calculation.multiplication();
        calculation.div();

    }

    public  void addition(){
        int a ,b ,c ;
        Scanner user = new Scanner(System.in);
        System.out.println("enter 1st ");
        a = user.nextInt();
        System.out.println("enter 2nd ");
        b = user.nextInt();

        c = a+b;
        System.out.println("addition is : "+c);
    }

    public  void  substraction(){
        int a,b, c ;
        Scanner user =new  Scanner(System.in);
        System.out.println("enter 1st ");
        a = user.nextInt();
        System.out.println("enter 2nd ");
        b = user.nextInt();
        c = a+b;
        System.out.println("substraction is : "+c);
    }
    public  void multiplication(){
        int a,b,c;
        Scanner user = new Scanner(System.in); //for taking input from user we have to import scanner from {java.util} package
        System.out.println("enter 1st ");
        a = user.nextInt();
        System.out.println("enter 2nd ");
        b = user.nextInt();
        c = a*b;
        System.out.println("multiplication is : "+c);
    }
    public void div(){
        int a,b,c;
        Scanner user = new Scanner(System.in);
        System.out.println("enter 1st ");
        a = user.nextInt();
        System.out.println("enter 2nd ");
        b = user.nextInt();
        c = a/b;
        System.out.println("divition is : "+c);
    }
}
