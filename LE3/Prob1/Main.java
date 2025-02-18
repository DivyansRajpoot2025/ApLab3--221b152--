
public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();
        Bharatvanshi kaurav = new Kaurav();
    
        System.out.println("Arjun:");
        arjun.fight();
        ((Pandav) arjun).kind(); 
        
        System.out.println("\nBheem:");
        bheem.fight();
        ((Bheem) bheem).kind(); 
        
        System.out.println("\nVikarn:");
        vikarn.fight();
        ((Vikarn) vikarn).obey(); 
        ((Vikarn) vikarn).kind(); 
        System.out.println("\nKaurav:");
        kaurav.fight();
        ((Kaurav) kaurav).disobey();
    }
}
