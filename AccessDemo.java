class Example {
    private int privateVar = 10;      
    int defaultVar = 20;              
    protected int protectedVar = 30;  
    public int publicVar = 40;        
    private void privateMethod() {
        System.out.println("Private Method: privateVar = " + privateVar);
    }
    void defaultMethod() {
        System.out.println("Default Method: defaultVar = " + defaultVar);
    }
    protected void protectedMethod() {
        System.out.println("Protected Method: protectedVar = " + protectedVar);
    }
    public void publicMethod() {
        System.out.println("Public Method: publicVar = " + publicVar);
        privateMethod();
    }
}
public class AccessDemo {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.defaultMethod();    
        obj.protectedMethod();   
        obj.publicMethod();     
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}
