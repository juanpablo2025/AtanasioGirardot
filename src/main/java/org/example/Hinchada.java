package org.example;

public abstract class Hinchada {

    private String nombre;
    private String id;
    private int edad;
    private String correo;
    private int celular;

    private final int dia = (int) (Math.random()*(4 - 1)) + 1;


    public Hinchada() {
    }

    public Hinchada(String nombre, String id, int edad, String correo, int celular) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;


    }

    public String getNombre() {
        return nombre;
    }



    public String getId() {
        return id;
    }



    public int getEdad() {
        return edad;
    }



    public String getCorreo() {
        return correo;
    }



    public int getCelular() {
        return celular;
    }



    public int getDia() {
        return dia;
    }



    public double getIva() {
        double iva = 0.19;
        return iva;
    }


    public abstract double descuentoGrupo();

    public abstract double  descuentoDia();

    public abstract String  diaDeLaSemana();




}

