package Recusrsion;

public class Factorial {

    public static int calcFactorial(int num){
        int total = 0;
        if(num > 0 ){
            System.out.print(num + "*");
            return num * calcFactorial(num-1);
        }else{
            return 1;
        }
    }

    static int n1=0,n2=1,n3=1;

    public static void printFibonacci(int count){

        if(count > 0){
            n3 = n1+n2;
            n1 =n2;
            n2 = n3;
            System.out.print(n3 + ", ");
            printFibonacci(count -1);
        }
    }

    public static void main(String[] args){

        System.out.println("\nTotal :: " + Factorial.calcFactorial(5));

        System.out.println("Fibonacci Series of 20 numbers");
        int count = 20;
        System.out.print(n1 + ", " + n2 + ", ");
        Factorial.printFibonacci(count-2);


    }
}
