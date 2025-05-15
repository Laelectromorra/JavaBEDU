import java.util.Scanner;

public class Main {
    //🩺 Crea una clase llamada Paciente.
    static class Paciente{
        String nombre;
        int edad;
        String expediente;

        public void mostrarInformacion(){
            System.out.println("Paciente: "+nombre+" - Edad: "+edad+" - Expediente: "+expediente);
    }
    }
    public static void main(String[] args) {
        /*📥 Utiliza la clase Scanner para solicitar los siguientes datos desde la consola:

        Nombre del paciente (String)
        Edad del paciente (int)
        Número de expediente (String)
🧱 Declara atributos en la clase Paciente para almacenar esta información.*/
        Scanner sc= new Scanner(System.in);

        System.out.print("Nombre del paciente: ");
        String nombre = sc.nextLine();

        System.out.print("Edad del paciente: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Número de expediente: ");
        String expediente = sc.nextLine();

        //Crea un objeto de tipo Paciente
        Paciente paciente = new Paciente();
        paciente.nombre = nombre;
        paciente.edad = edad;
        paciente.expediente = expediente;

        //Llama al metodo mostrarInformacion() para mostrar los datos en consola
        paciente.mostrarInformacion();

        sc.close();
    }
}