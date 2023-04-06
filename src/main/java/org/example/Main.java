package org.example;


import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grupo1 venta1 = new Grupo1("Ramon", "54587", 50, "usuarioprueba@gmail.com", 38453215);
        Grupo2 venta2 = new Grupo2("Sebastían", "23548", 28, "usuarioprueba@gmail.com", 35482542);
        Grupo3 venta3 = new Grupo3("Jose", "32154", 46, "usuarioprueba@gmail.com", 35554821);
        Grupo4 venta4 = new Grupo4("David", "65326", 32, "usuarioprueba@gmail.com", 36988563);
        double popular = 40000, oriental = 80000, occidental = 150000;
        int cantidadBoletas;


        System.out.print("                VENTA DE BOLETERIA             " + "\n"+ "\n" + "BIENVENIDO ¿Eres abonado?"+"\n"+" 1 •Si 2 •No");
        int abonado = sc.nextInt();


        if (abonado == 1) {


            System.out.print("¿Cuál es la tribuna a la quiere asistír al partido como abonado?"+"\n"+" 1 •Popular 2 •Oriental 3 •Occidental "+"\n");
            int tribuna = sc.nextInt();
            if (tribuna == 1) {

                String fecha = venta1.diaDeLaSemana();
                double descuentoDia = popular * venta1.descuentoDia();
                double descuentoGrupo = popular * venta1.descuentoGrupo();
                double valorTotal = (popular - descuentoDia) - descuentoGrupo;
                double valorTotalIva = valorTotal + (valorTotal * venta1.getIva());
                System.out.println("               Boleta            "+"\n"+"\n"+"• Nombre: "+venta1.getNombre()+"\n"+"• Documento:"+venta1.getId()+"\n"+"• Edad: "+venta1.getEdad()+"\n"+"• Correo: "+ venta1.getCorreo()+"\n"+"• Telefono: "+venta1.getCelular()+"\n"+"• Fecha: "+fecha+"\n"+"• Valor Inicial: "+popular+"\n"+"• descuento dia: "+descuentoDia +"\n"+"• descuento grupo: "+descuentoGrupo+"\n"+"• Valor: "+valorTotal+"\n"+"• Valor con Iva: "+valorTotalIva );


            }
            if (tribuna == 2) {

                System.out.print("¿Cantidad de boletas "+ "\n");
                cantidadBoletas = sc.nextInt();
                if(cantidadBoletas<=2) {
                    String fecha = venta3.diaDeLaSemana();
                    double descuentoDia = oriental * venta2.descuentoDia();
                    double descuentoGrupo = oriental * venta2.descuentoGrupo();
                    double valorTotal = (oriental - descuentoDia) - descuentoGrupo;
                    double valorTotalIva = valorTotal + (valorTotal * venta2.getIva());
                    double totalCantidad = valorTotalIva * cantidadBoletas;
                    System.out.println("               Boleta            " + "\n" + "\n" + "• Nombre: " + venta1.getNombre() + "\n" + "• Documento:" + venta1.getId() + "• Edad: " + venta1.getEdad() + "\n" + "• Correo: " + venta1.getCorreo() + "\n" + "• Telefono: " + venta1.getCelular() + "\n" + "• Fecha: " + fecha + "\n" + "• Valor Inicial: " + oriental + "\n" + "• descuento dia: " + descuentoDia + "\n" + "• descuento grupo: " + descuentoGrupo + "\n" + "• Valor: " + valorTotal + "\n" + "• Valor con Iva: " + valorTotalIva+"\n" + "• Cantidad de boletas: " + cantidadBoletas+ "\n" +"• Valor Total: " + totalCantidad);
                }
                if(cantidadBoletas>2){
                    System.out.println("Solo 2 boletas por abonado"+ "\n");
                    Main.main (null);
                }

            }
            if (tribuna == 3) {

                System.out.print("¿Cantidad de boletas "+ "\n");
                cantidadBoletas = sc.nextInt();

                if(cantidadBoletas<=3) {
                String fecha = venta3.diaDeLaSemana();
                double descuentoDia = occidental * venta3.descuentoDia();
                double descuentoGrupo = occidental * venta3.descuentoGrupo();
                double valorTotal = (occidental - descuentoDia) - descuentoGrupo;
                double valorTotalIva = valorTotal + (valorTotal * venta3.getIva());
                double totalCantidad = valorTotalIva * cantidadBoletas;
                System.out.println("               Boleta            " + "\n" + "\n" + "• Nombre: " + venta1.getNombre() + "\n" + "• Documento:" + venta1.getId() + "\n" + "• Edad: " + venta1.getEdad() + "\n" + "• Correo: " + venta1.getCorreo() + "\n" + "• Telefono: " + venta1.getCelular() + "\n" + "• Fecha: " + fecha + "\n" + "• Valor Inicial: " + occidental + "\n" + "• descuento dia: " + descuentoDia + "\n" + "• descuento grupo: " + descuentoGrupo + "\n" + "• Valor: " + valorTotal + "\n" + "• Valor con Iva: " + valorTotalIva+ "\n" + "• Cantidad de boletas: " + cantidadBoletas+ "\n" +"• Valor Total: " + totalCantidad);
            }
            if(cantidadBoletas>3){
                System.out.println("Solo 2 boletas por abonado"+ "\n");
                Main.main (null);
            }

            }
            if (tribuna == 0 || tribuna >= 4) {


                System.out.println("Salir...");
                exit(0);



            }


        }


        if (abonado == 2) {


            System.out.print("¿Cuál es la tribuna a la quiere asistír al partido? "+"\n"+" 1 •Popular 2 •Oriental 3 •Occidental: "+"\n"+"\n");
            int tribuna = sc.nextInt();
            if (tribuna == 1) {

                System.out.print("¿Cantidad de boletas? "+ "\n");


                cantidadBoletas = sc.nextInt();

                if(cantidadBoletas<=5) {
                double descuentoDia = popular * venta4.descuentoDia();
                double valorTotal = popular - descuentoDia;
                double valorTotalIva = valorTotal + (valorTotal * venta4.getIva());
                double totalCantidad = valorTotalIva * cantidadBoletas;
                String fecha = venta4.diaDeLaSemana();
                System.out.println("               Boleta            " + "\n" + "\n" + "• Nombre: " + venta1.getNombre() + "\n" + "• Documento:" + venta1.getId() +"\n" + "• Edad: " + venta1.getEdad() + "\n" + "• Correo: " + venta1.getCorreo() + "\n" + "• Telefono: " + venta1.getCelular() + "\n" + "• Fecha: " + fecha + "\n" + "• Valor Inicial: " + popular + "\n" + "• descuento dia: " + descuentoDia + "\n" + "• Valor: " + valorTotal + "\n" + "• Valor con Iva: " + valorTotalIva+ "\n" + "• Cantidad de boletas: " + cantidadBoletas+ "\n" +"• Valor Total: " + totalCantidad);
            }
            if(cantidadBoletas>5){
                System.out.println("Solo 5 boletas por cliente"+ "\n");
                Main.main (null);
            }

            }
            if (tribuna == 2) {

                System.out.print("¿Cantidad de boletas ?"+ "\n");
                cantidadBoletas = sc.nextInt();

                if(cantidadBoletas<=5) {
                    double descuentoDia = oriental * venta4.descuentoDia();
                    String fecha = venta4.diaDeLaSemana();
                    double valorTotal = oriental - descuentoDia;
                    double valorTotalIva = valorTotal + (valorTotal * venta4.getIva());
                    double totalCantidad = valorTotalIva * cantidadBoletas;
                    System.out.println("               Boleta            " + "\n" + "\n" + "• Nombre: " + venta1.getNombre() + "\n" + "• Documento:" + venta1.getId() + "\n" +"• Edad: " + venta1.getEdad() + "\n" + "• Correo: " + venta1.getCorreo() + "\n" + "• Telefono: " + venta1.getCelular() + "\n" + "• Fecha: " + fecha + "\n" + "• Valor Inicial: " + oriental + "\n" + "• descuento dia: " + descuentoDia + "\n" + "• Valor: " + valorTotal + "\n" + "• Valor con Iva: " + valorTotalIva+"\n" + "• Cantidad de boletas: " + cantidadBoletas+ "\n" +"• Valor Total: " + totalCantidad);
                }
                    if(cantidadBoletas>5){
                        System.out.println("Solo 5 boletas por cliente"+ "\n");
                        Main.main (null);
                    }

            }
            if (tribuna == 3) {

                System.out.print("¿Cantidad de boletas ?"+ "\n");
                cantidadBoletas = sc.nextInt();

                if(cantidadBoletas<=5) {
                    String fecha = venta4.diaDeLaSemana();
                    double descuentoDia = occidental * venta4.descuentoDia();
                    double valorTotal = occidental - descuentoDia;
                    double valorTotalIva = valorTotal + (valorTotal * venta4.getIva());
                    double totalCantidad = valorTotalIva * cantidadBoletas;
                    System.out.println("               Boleta            " + "\n" + "\n" + "• Nombre: " + venta1.getNombre() + "\n" + "• Documento:" + venta1.getId() + "\n" +"• Edad: " + venta1.getEdad() + "\n" + "• Correo: " + venta1.getCorreo() + "\n" + "• Telefono: " + venta1.getCelular() + "\n" + "• Fecha: " + fecha + "\n" + "• Valor Inicial: " + occidental + "\n" + "• descuento dia: " + descuentoDia +"\n" + "• Valor: " + valorTotal + "\n" + "• Valor con Iva: " + valorTotalIva+"\n" + "• Cantidad de boletas: " + cantidadBoletas+ "\n" +"• Valor Total: " + totalCantidad);
                }
                if(cantidadBoletas>5){
                    System.out.println("Solo 5 boletas por cliente"+ "\n");
                    Main.main (null);
                }


            }
            if (tribuna == 0 || tribuna >= 4) {


                System.out.println("Salir...");
                exit(0);


            }
        }
        if(abonado==0||abonado>=3){
            System.out.println("Salir...");
            exit(0);
        }

        System.out.println("Quieres comprar más boletas?"+"\n"+" 1 •Si 2 •No");
        int comprarmas = sc.nextInt();
        if(comprarmas==1){
            Main.main (null);
        }
        if(comprarmas>=2||comprarmas==0){
            exit(0);
        }

    }
}