//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        //🎫 Crea una clase llamada Entrada.
        static class Entrada{
            /*🧱 Declara los siguientes atributos:

Nombre del evento (String)
Precio de la entrada (double)*/
            String nombreDelEvento;
            double precioDeLaEntrada;
            //🛠️ Crea un constructor que reciba ambos valores al momento de crear el objeto.
            public Entrada(String nombreDelEvento,int precioDeLaEntrada){
                this.nombreDelEvento = nombreDelEvento;
                this.precioDeLaEntrada = precioDeLaEntrada;
            }
            //📢 Agrega un metodo público llamado mostrarInformacion() que imprima el siguiente formato:
            public void mostrarInformacion(){
                System.out.println("Evento: "+nombreDelEvento+" | "+"Precio: $"+precioDeLaEntrada);
            }
        }
        //🧪 Crea una clase llamada Principal y dentro del metodo main():
    public static void main(String[] args) {

            //Crea al menos dos objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450);
        Entrada entrada2 = new Entrada("Función de cine", 250);

        //Llama al metodo mostrarInformacion() para mostrar los datos en consola
            entrada1.mostrarInformacion();
            entrada2.mostrarInformacion();
    }
}