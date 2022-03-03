package Examen1;

public class avioneta extends VehiculoAereo{
    private float coeficienteDeAerodinamismo; /* 0 = ineficiente y 1= muy eficiente*/

    public avioneta(){
    	super("Avioneta", 680, 325, 1, 0, 193, 2); 
        //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
        coeficienteDeAerodinamismo = 0.5f; 
    }

    public void setAero(float aero){
        coeficienteDeAerodinamismo = aero;
        System.out.println("Ahora el coeficiente de aerodinamismo es de: " + aero);
    }

    public void getAero(){
        System.out.println("El aerodinamismo de la avioneta es de: " + coeficienteDeAerodinamismo);
    }

    public void calcularPrecioEspecifico(){
        float precioBase = calcularPrecioBase();
        float precioEspecifico = precioBase + coeficienteDeAerodinamismo * 175;
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
    }
}