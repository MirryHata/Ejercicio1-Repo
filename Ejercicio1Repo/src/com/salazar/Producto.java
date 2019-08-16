package com.salazar;

public class Producto {
    int codigo;
    String descripcion;
    Double precio;
    Boolean gravado;

    public Producto(int codigo, String descripcion, Double precio, Boolean gravado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gravado = gravado;
    }

    public Double Calcimpuesto(){
        Double impuesto = 0d;
        if(gravado == true){
            impuesto = precio * 0.15;
            return impuesto;
        }else{
            return impuesto;
        }
    }
}
