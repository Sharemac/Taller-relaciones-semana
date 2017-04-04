
package ejercicioclase;

import java.util.ArrayList;


public class EjercicioClase {


    public static void main(String[] args) {
       Motor m1 = new Motor(50, 1245);
       Ruedas r1 = new Ruedas(45, "Tipo d");
       Ruedas r2 = new Ruedas(45, "Tipo t");
       Ruedas[] ruedas = new Ruedas[4];
       ruedas[0]=r1;
       ruedas[1]=r2;
       ruedas[2]=r1;
       ruedas[3]=r2;
       Carro carro = new Carro("abc123", 1996 ,ruedas, m1, "azul", 7896);
       
       Motor m2 = new Motor(2000, 1589);
       Ruedas[] ruedas2 = new Ruedas[4];
       ruedas[0]=r1;
       ruedas[1]=r2;
       ruedas[2]=r1;
       ruedas[3]=r2;
       Carro carro2 = new Carro("sac163", 2017 ,ruedas, m1, "gris", 5697);
       
      ArrayList<Carro> carros = new ArrayList();
      carros.add(carro);
      carros.add(carro2);
       
       Persona persona = new Persona("Sharem", 1019117706, 31080,carros);
      persona.listar();
    }

}
