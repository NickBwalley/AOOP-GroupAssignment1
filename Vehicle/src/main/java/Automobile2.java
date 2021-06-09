interface Automobile{
    public void accelerate();
    public void stop();
//    public void Sedan();
    public class Sedan{};
}

public class Automobile2 implements Automobile{
    public void accelerate(){
        System.out.println("Accelerate Method!");
    }
    
    public void stop(){
        System.out.println("Stop Method!");
    }
    
    public class Sedan{
        
    }
    
    public void display_sedan(){
        Sedan mySedan = new Sedan();
    }
    
    

    
}
