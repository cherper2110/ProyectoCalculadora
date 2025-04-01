public class Calculadora {
    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para realizar una operación según la entrada
    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        } else {
            System.out.println("Operación no soportada aún.");
            return 0;
        }
    }
    // Método de resta
    public int resta() {
        return num1 - num2;
    }
    // Método de multiplicación
    public int multiplicar() {
        return num1 * num2;
    }
    // Método de suma
    public int suma() {
        return num1 + num2;
    }
}
