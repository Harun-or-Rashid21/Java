
package if_else;

import java.util.Scanner;

public class If_Else {

    
    public static void main(String[] args) {
        System.out.println("Enter Integer Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<10){
            System.out.println("Hello!!!");
        }else{
            System.out.println("Bye");
        }
        
        
    }
    
}
