public class CrowAdaptor implements Swan{
    private Crow crow;
    public CrowAdaptor(Crow crow){
        this.crow=crow;
    }
    public void sing(){
        crow.cry();
    }
     public void swim(){
        crow.fly();
    }
     public void eat(){
        crow.eat();
    }
    
    
}