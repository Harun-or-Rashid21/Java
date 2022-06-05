package parameterized.constructor;


public class ParameterizedConstructor {
    
    String language;
    
    ParameterizedConstructor(String lang){
        language = lang;
        System.out.println(language+ " Programiz Language");
    }
    
    public static void main(String[] args) {
       
        
        ParameterizedConstructor pc = new ParameterizedConstructor("java");
        ParameterizedConstructor ps = new ParameterizedConstructor("C");
        ParameterizedConstructor pd = new ParameterizedConstructor("Python");
        
        
    }
    
}
