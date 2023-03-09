package org.example;

import java.text.MessageFormat;

public class
Restaurante {
    public static void main(String[] args) {

        //voy con mi esposa a cenar a un restaurante.
        //Cada uno pide una cena:

        Comida comidaUno= new Comida();
        comidaUno.setEntrada(new Entrada("Sopa de esparragos",28000));
        comidaUno.setPlatofuerte(new PlatoFuerte("beef chorizo",55000));
        comidaUno.setBebida(new Bebida("Vino tinto", 45000));
        comidaUno.setPostre(new Postre("tiramizu escarchado",34500));

        Integer costoComida1 = comidaUno.calcularCostoComida();

        Comida comidaDos = new Comida();
        comidaDos.setEntrada(new Entrada("muelas de cangrejo",30000));
        comidaDos.setPlatofuerte(new PlatoFuerte("pato a la naranja", 58000));
        comidaDos.setBebida(new Bebida("Soda de miel y tamarindo",18500));
        comidaDos.setPostre(new  Postre("volcan de ciruelas",22000));

        Integer costoComida2 = comidaDos.calcularCostoComida();

        System.out.print("El costo total de la cena para dos fue de: $");
        //PONGA ACA LA LINEA QUE PERMITA ENCONTRAR EL REUSLTADO
        System.out.println(costoComida1 + costoComida2);
    }
}