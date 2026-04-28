public class App {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        
        
        int totalPares = contarPares(numeros);
        System.out.println("Quantidade de pares: " + totalPares);
    }

    public static int contarPares(int[] array) {
        
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            
            if (array[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}
