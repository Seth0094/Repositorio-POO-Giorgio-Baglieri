package pooCoches;

public class UsoCamioneta {
	
	
	public static void main (String[] args) {
	Camioneta camionetagiorgio= new Camioneta(); 
		
		
    
    
    camionetagiorgio.establececolor("Verde"); 
    camionetagiorgio.estableceClimatizador("si"); 
    camionetagiorgio.estableceAsientosCuero("si"); 
       
       
       
      System.out.println(camionetagiorgio.Dimecolor()); 
      System.out.println(camionetagiorgio.DimeRuedas()); 
      System.out.println(camionetagiorgio.DimeLargo()); 
      System.out.println(camionetagiorgio.DimeAncho()); 
      System.out.println(camionetagiorgio.DimeClimatizador()); 
      System.out.println(camionetagiorgio.DimeAsientos()); 
      System.out.println(camionetagiorgio.DimeMotor()); 
      System.out.println(camionetagiorgio.DimePesoPlataforma()); 
      System.out.println(camionetagiorgio.DimePesoTotal()); 
     }
	
	
	
}
	


