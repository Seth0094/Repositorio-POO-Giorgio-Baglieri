package pooCoches;

public class UsoMoto {

	
public static void main (String[] args) {
		
		Moto MotoGiorgio= new Moto();
		
		
		MotoGiorgio.establececolor("Azul");
		MotoGiorgio.estableceAsientosCuero("si");
		
		
		
		System.out.println(MotoGiorgio.Dimecolor());
		System.out.println(MotoGiorgio.DimeRuedas());
		System.out.println(MotoGiorgio.DimeLargo());
		System.out.println(MotoGiorgio.DimeAncho());
		System.out.println(MotoGiorgio.DimeAsientos());
		System.out.println(MotoGiorgio.DimeMotor());
		System.out.println(MotoGiorgio.DimePesoPlataforma());
		System.out.println(MotoGiorgio.DimePesoTotal());
	}
		
			
	
		
	
	
}
