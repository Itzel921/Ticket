package ticket;

import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] descripcion = new String[150];
        int[] cantidad = new int[150];
        double[] precio = new double[150];
        double total = 0.0;
        String opcion;
        int cant = 0; 

        do {
            System.out.print("Producto: ");
                String producto = scn.nextLine();
            System.out.print("Cantidad: ");
                int cantidadProducto = scn.nextInt();
            System.out.print("Precio: ");
                double precioUni = scn.nextDouble();
            scn.nextLine();

            descripcion[cant] = producto;
            cantidad[cant] = cantidadProducto;
            precio[cant] = precioUni;
            cant++;

            System.out.println("Desea finalizar? (S/N)");
            opcion = scn.nextLine();
        } while (!opcion.equalsIgnoreCase("S"));

        for (int i = 0; i < cant; i++) {
            total = total + cantidad[i] * precio[i];
        }
                
        System.out.println("                        TIENDITA");
        System.out.println("------------------------------------------------------");
        System.out.println("DESCRIPCIÓN         CANTIDAD         PRECIO ");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < cant; i++) {
            System.out.println(descripcion[i] + "                " + cantidad[i] + "                 " + precio[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("TOTAL:                                 "+ total+"\n");
    }
}
