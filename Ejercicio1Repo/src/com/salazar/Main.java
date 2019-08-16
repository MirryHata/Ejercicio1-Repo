package com.salazar;

public class Main {

    public static void main(String[] args) {
        Producto Cargador = new Producto(0000, "Cargador", 500d, true);
        Producto Galleta = new Producto(1111, "Galletita", 5d, true);
        Producto Pollo = new Producto(2222, "Pollo. Tengo hambre :(", 200d, false);

        System.out.println("Su producto es un " +Cargador.descripcion+" y el impuesto es de: " + Cargador.Calcimpuesto());
        System.out.println("Su producto es una "+Galleta.descripcion+" y el impuesto es de: "+Galleta.Calcimpuesto());
        System.out.println("Su producto es un "+Pollo.descripcion +" y el impuesto es de: "+Pollo.Calcimpuesto());
    }
}
