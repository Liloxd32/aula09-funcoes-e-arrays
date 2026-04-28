 // Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void main(String[] args) {
        
        int[] numeros = {4, 7, 2, 9, 1};
        
        
        int maior = encontrarMaior(numeros);
        System.out.println("Maior valor: " + maior);
    }

    public static int encontrarMaior(int[] array) {
        
        int maiorEncontrado = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorEncontrado) {
                maiorEncontrado = array[i];
            }
        }

        return maiorEncontrado;
    }
}
