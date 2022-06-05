package loopforeach;


public class LoopForeach {

    
    public static void main(String[] args) {
        
        int[] num = {10, 20, 30, 40, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        
        for (int i : num) {
            
            sum = sum + i;
            
        }
        System.out.println(sum);
        
        
    }
    
}
