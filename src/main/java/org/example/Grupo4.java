package org.example;


public class Grupo4 extends Hinchada{

    public Grupo4() {
    }

    public Grupo4(String nombre, String id, int edad, String correo, int celular) {
        super(nombre, id, edad, correo, celular);
    }
    @Override
    public double descuentoGrupo() {
        return 0;
    }

    @Override
    public double descuentoDia() {
        double descuento=0;
        if (this.getDia() == 1) {

            descuento = 0.05;
        }
        if (this.getDia() == 2) {

            descuento = 0.02;
        }
        if (this.getDia() == 3) {

            descuento = 0.015;
        }
        if (this.getDia() == 4) {

            descuento = 0.01;
        }
        return descuento;
    }

    @Override

        public String diaDeLaSemana() {
        String diaDeLaSemana = "";


        if (this.getDia() == 1) {

            diaDeLaSemana = "Martes (21/03/2023)";
        }
        if (this.getDia() == 2) {

            diaDeLaSemana = "Miercoles (22/03/2023)";
        }
        if (this.getDia() == 3) {

            diaDeLaSemana = "Jueves (23/03/2023)";
        }
        if (this.getDia() == 4) {

            diaDeLaSemana ="Viernes (24/03/2023)";
        }
        return diaDeLaSemana;
    }
}

