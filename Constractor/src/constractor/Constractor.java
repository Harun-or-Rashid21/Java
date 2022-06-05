package constractor;


public class Constractor {
    
    private String name;
    
    Constractor(){
        
        System.out.println("Constractor Called");
        
        name = "Harun";
    }
    
    
    public static void main(String[] args) {
        
        Constractor ob = new Constractor();
        
        System.out.println("The name is: "+ob.name);
        
        
    }
    
}
