import java.util.Scanner;

public class Main {
    //💊 Crea una clase llamada SimuladorFarmacia.
    static class SimuladorFarmacia{
        String nombreDelMedicamento;
        int cantPiezas;
        double precioUnitario;
        double total;
        double totalConDescuento;
        boolean aplica;
        double descuento;

        //Supón que si el total supera los $500.00, la farmacia ofrece un 15% de descuento.
        // Aplica el descuento usando el operador ternario (? :) sin estructuras if.
        public void calcTotal(){
            total = cantPiezas*precioUnitario;
        }
        public void calcTotalDesc(){
            totalConDescuento = total > 500? total*0.85 : total;
        }
        public void aplicaDesc() {
            aplica = total > 500 ? true : false;
        }
        public void descTot(){
            descuento = total*0.15;
        }
        public void mostrarResumen() {
            System.out.println("Medicamento: " + nombreDelMedicamento);
            System.out.println("Cantidad: " + cantPiezas);
            System.out.println("Precio unitario: $" + precioUnitario);
            System.out.println("Total sin descuento: $" + total);
            System.out.println("¿Aplica descuento?: " + aplica);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalConDescuento);
        }
    }
    public static void main(String[] args) {
        /*Solicita al usuario que introduzca los siguientes datos:
        Nombre del medicamento (tipo String)
        Precio unitario (tipo double)
        Cantidad de piezas (tipo int)*/
        SimuladorFarmacia sf = new SimuladorFarmacia();
        Scanner sc = new Scanner(System.in);
        System.out.print("Medicamento: ");
        sf.nombreDelMedicamento = sc.nextLine();
        System.out.print("Cantidad: ");
        sf.cantPiezas = sc.nextInt();
        sc.nextLine();
        System.out.print("Precio unitario: ");
        sf.precioUnitario = sc.nextDouble();
        sc.nextLine();
        sf.calcTotal();
        sf.aplicaDesc();
        sf.descTot();
        sf.calcTotalDesc();
        sf.mostrarResumen();
        sc.close();
}
    }