public class PruebaCalculadora {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora con dos números
        Calculadora calc = new Calculadora(10, 5);

        // Probar la operación de suma
        System.out.println("Suma: " + calc.realizarOperacion("suma"));

        // Probar la operación de resta
        System.out.println("Resta: " + calc.realizarOperacion("resta"));

        // Probar la operación de multiplicación
        System.out.println("Multiplicación: " + calc.realizarOperacion("multiplicacion"));

        // Probar la operación de división
        System.out.println("División: " + calc.realizarOperacion("division"));

        // Probar la operación de módulo
        System.out.println("Módulo: " + calc.realizarOperacion("modulo"));
    }
}
