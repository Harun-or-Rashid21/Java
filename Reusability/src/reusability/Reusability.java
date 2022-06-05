package reusability;

public class Reusability {
    
    
    private static int square(int n){
    
        
        return n * n;
    }

 
    public static void main(String[] args) {
        
        
        for(int i = 1; i <= 5; i++){
            
            int result;
            result = square(i);
            System.out.println("Square of "+i+ " is: "+result);
        }
        
        
    }
    
}
