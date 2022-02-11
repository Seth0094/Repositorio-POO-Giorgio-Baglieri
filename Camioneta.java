package pooCoches;

public class Camioneta {
	
	private int Largo; 
	   private int Ancho; 
	   private int Ruedas; 
	   private int Motor; 
	   private int PesoPlataforma; 
	   private int PesoCarroceria; 
	    
	   private String color; 
	   private int PesoTotal; 
	   private boolean AsientosCuero, Climatizador; 
	    
	   // metodo constructor () 
	    
	   public Camioneta () { 
	     
	    Ruedas= 4; 
	    Largo= 4000; 
	    Ancho= 800; 
	    Motor= 1700; 
	    PesoPlataforma= 600; 
	    PesoCarroceria= 800; 
	     
	   } 
	    
	    //getter 
	   public String DimeLargo() { 
	    return "el Largo de la camioneta es:  "+ Largo; 
	       
	   } 
	    
	   public String DimeAncho() { 
	    return "el Ancho de la camioneta es:  "+ Ancho; 
	       
	   } 
	    
	    
	   public String DimeRuedas() { 
	    return "el numero de Ruedas es: "+Ruedas; 
	   } 
	   public String Dimecolor () { 
	    return "El color de la camioneta es "+color; 
	   } 
	   public String DimeClimatizador() { 
	    if(Climatizador==true) { 
	     return "La Camioneta incorpora climatizador"; 
	    }else { 
	     return "La camioneta lleva aire acondicionado"; 
	    } 
	   } 
	      public String DimeAsientos() { 
	          
	         if(AsientosCuero==true){ 
	            
	           return "los asientos son de cuero"; 
	         }else { 
	           return "los asientos son de serie"; 
	         } 
	        } 
	       
	      public String DimeMotor() { 
	      return "el Motor de la camioneta es de:  "+ Motor; 
	         
	     } 
	      public String DimePesoPlataforma() { 
	      return "el Peso Plataforma de la camioneta es:  "+ PesoPlataforma; 
	         
	     } 
	       
	       
	      public String DimePesoTotal() {//SETTER + GETTER 
	       
	          
	         PesoTotal=PesoPlataforma+PesoCarroceria; 
	              
	         if(AsientosCuero==true) { 
	            
	           PesoTotal=PesoTotal+50; 
	            
	         } 
	         if(Climatizador==true) { 
	           PesoTotal=PesoTotal+20; 
	         } 
	          
	         return "el Peso Total de la camioneta es "+PesoTotal; 
	       } 
	       
	       
	       
	       
	       
	   
	   //Setters 
	    
	   public void estableceLargo (int LargoCamioneta) { 
	    Largo=LargoCamioneta; 
	   } 
	    
	   public void estableceAncho (int AnchoCamioneta) { 
	    Ancho=AnchoCamioneta; 
	   } 
	    
	   public void establececolor(String colorCamioneta) { 
	     
	    color=colorCamioneta; 
	   } 
	       
	        
	   
	   public void estableceRuedas(int RuedasCamioneta) { 
	   
	     Ruedas=RuedasCamioneta; 
	   } 
	      public void estableceClimatizador (String Climatizador) 
	      { 
	       if(Climatizador.equalsIgnoreCase("si")) { 
	        this.Climatizador=true; 
	       }else { 
	        this.Climatizador=false; 
	        
	       } 
	      } 
	      public void estableceAsientosCuero(String AsientosCuero) { 
	           
	          if(AsientosCuero.equalsIgnoreCase("si")){ 
	             
	            this.AsientosCuero=true; 
	          }else { 
	            this.AsientosCuero=false; 
	          } 
	         
	              } 
	       
	      public void estableceMotor (int MotorCamioneta) { 
	    Motor=MotorCamioneta; 
	   } 
	       
	      public void establecePesoPlataforma (int PesoPlataformaCamioneta) { 
	    PesoPlataforma=PesoPlataformaCamioneta; 
	   }
	

}
