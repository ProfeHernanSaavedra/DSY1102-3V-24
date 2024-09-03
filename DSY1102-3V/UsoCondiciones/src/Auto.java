/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profehernansaavedra
 * @version 27-08-2024
 */
public class Auto {
    
    private String marca,modelo,tipoCombustible;
    private int año;
    private double cilindrada;

    public Auto() {
        marca = "Suzuki";
        modelo = "Baleno";
    }

    public Auto(String marca, String modelo, String tipoCombustible, int año, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cilindrada=" + cilindrada + '}';
    }

    public void imprimirAuto()
    {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Tipo Combustible: " + this.getTipoCombustible());
    }

    
    
    
    
    
}
