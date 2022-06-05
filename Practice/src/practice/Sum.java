package practice;

import java.util.Scanner;

public class Sum {
    
    
    public static int square(int num){
    
    return num*num;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result;
        
        result = square(n);
        System.out.println("Sqared value of "+n+ " is:" +result);
    }
    
}
