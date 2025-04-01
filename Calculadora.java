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
        switch (operacion) {
            case "suma":
                return suma();
            case "resta":
                return resta();
            case "multiplicacion":
                return multiplicar();
            case "division":
                return dividir();
            case "modulo":
                return modulo();
            default:
                System.out.println("Operación no válida");
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
    // Método de división
    public int dividir() {
    if (num2 != 0) {
        return num1 / num2;
    } else {
        System.out.println("Error: No se puede dividir entre 0.");
        return 0;
    }
}

    // Método de suma
    public int suma() {
        return num1 + num2;
    }
}
