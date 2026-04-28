 // Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void imprimirArray(int[] numeros) {
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        int[] entrada = { 10, 20, 30, 40, 50};

        
        imprimirArray(entrada);

    }
}
