
package nonargumentconstractor;


public class NonArgumentConstractor {
    int i;
    private NonArgumentConstractor(){
        System.out.println("Constractor Is called!!!!");
        
        i = 10;
    
    }

    public static void main(String[] args) {
        
        NonArgumentConstractor nb = new NonArgumentConstractor();
        System.out.println("Value of I: "+nb.i);
        
    }
    
}
