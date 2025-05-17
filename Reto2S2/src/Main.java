import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int saldoInicial= 1000;
        String[] menu = {"1. Consultar saldo",
                "2. Depositar dinero",
                "3. Retirar dinero",
                "4. Salir" };
        boolean salir = false;
        while (!salir) {
            int seleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una opción","Cajero Automático",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                    menu, menu[0]);
            switch (seleccion){
                case 0: JOptionPane.showMessageDialog(null,"Tu saldo es: "+saldoInicial);
                break;
                case 1: JOptionPane.showMessageDialog(null,"Has depositado dinero");
                break;
                case 2: JOptionPane.showMessageDialog(null, "Has retirado dinero");
                break;
                case 3: JOptionPane.showMessageDialog(null, "¡Nos vemos pronto :)!");
                salir = true;
                break;
            }
        }
    }
}
