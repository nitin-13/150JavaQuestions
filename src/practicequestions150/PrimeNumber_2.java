package practicequestions150;

import java.util.Scanner;

/*
num = 23;
i= 2 ,(num/i)= 11 ,(num%i)= 1
i= 3 ,(num/i)= 7 ,(num%i)= 2
i= 4 ,(num/i)= 5 ,(num%i)= 3
i= 5 ,(num/i)= 4 ,(num%i)= 3
i= 6 ,(num/i)= 3 ,(num%i)= 5
i= 7 ,(num/i)= 3 ,(num%i)= 2
i= 8 ,(num/i)= 2 ,(num%i)= 7
i= 9 ,(num/i)= 2 ,(num%i)= 5
i= 10 ,(num/i)= 2 ,(num%i)= 3
i= 11 ,(num/i)= 2 ,(num%i)= 1
23 is a prime number
*/
public class PrimeNumber_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        boolean prime = false;
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean check = isPrime(num);
        System.out.println(check);

//        if(num==0 || num==1){
//            System.out.println("0 OR 1 is not a prime number");
//        }
//
//        for (int i=2;i<=num/2;i++){
//            //System.out.println("i= "+i+" ,(num/i)= "+(num/i)+" ,(num%i)= "+(num%i));
//            if(num % i == 0){
//                prime = true;
//                break;
//            }
//        }
//
//        if(prime){
//            System.out.println(num+" is not a prime number");
//        }else {
//            System.out.println(num + " is a prime number");
//        }
    }

//    static void checkPrime(int num){
//        if(num==0 || num==1){
//            System.out.println("0 OR 1 is not a prime number");
//        }
//
//        int i = 2;
//        while(i*i <= num){
//            if(num % i == 0){
//                System.out.println("Not Prime Number");
//                break;
//            }
//            i+=1;
//        }
//        System.out.println("Prime Number");
//    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;

    }
}
