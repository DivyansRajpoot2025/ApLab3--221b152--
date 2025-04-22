public class Application{
    public static void main(String[] args){
        Crow crow=new IndianCrow();
        CrowAdaptor crowadaptor=new CrowAdaptor(crow);
        
        //client
        /*
        public client(Swan swan){
            swan.eat();
            swan.swim();
            swan.sing();
        }
        */
    }
}