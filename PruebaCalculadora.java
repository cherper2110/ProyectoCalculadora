public class PruebaCalculadora {
    public static void main(String[] args) {
        // Crear una instancia de la calculadora con dos números
        Calculadora calc = new Calculadora(10, 5);
        
        // Probar los métodos
        System.out.println("Suma: " + calc.realizarOperacion("suma"));
    }
}
