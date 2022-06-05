
package parameter;

import java.util.Scanner;
public class Parameter {
    
    
    public void display1(){
        System.out.println("Method without parameter");
    
    }
    
    public void display2(int n){
    
        System.out.println("Method with parameter: " + n);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Please Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Parameter pd = new Parameter();
        pd.display1();
        pd.display2(n);
        
        
    }
    
}
