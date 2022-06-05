package staticvariable;


public class StaticVariable {
    
    String name;
    int id;
    static String universityName = "Rajshahi University"; 
    
    StaticVariable(String n, int i){ 
          
        name = n;
        id = i;
        
}
    
    void display(){
    
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
        
    
    }


    public static void main(String[] args) {
        
        StaticVariable sv = new StaticVariable("Harun",266);
        sv.display();
        
        StaticVariable sv1 = new StaticVariable("Tahmina Shila",111);
        sv1.display();
        
        StaticVariable sv2 = new StaticVariable("Pikachu",123);
        sv2.display();
        
    }
    
}
