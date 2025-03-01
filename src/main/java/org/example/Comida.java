package org.example;

public class Comida {

    private Entrada entrada;
    private PlatoFuerte platofuerte;
    private Bebida bebida;
    private Postre postre;

    public Comida() {
    }

    public Comida(Entrada entrada) {
        this.entrada = entrada;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public PlatoFuerte getPlatofuerte() {
        return platofuerte;
    }

    public void setPlatofuerte(PlatoFuerte platofuerte) {
        this.platofuerte = platofuerte;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Postre getPostre() {
        return postre;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public Integer calcularCostoComida(){

        Integer costo = this.entrada.getCosto() + this.platofuerte.getCosto() + this.bebida.getCosto() + this.postre.getCosto();
        return costo;
    }


}
