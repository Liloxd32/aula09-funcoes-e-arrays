 // Nome: Davi Fernandes Alves
// Matrícula: 1261946667

public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 7, 3};
        

        double media = calcularMedia(numeros);
        
        System.out.printf("Média: %.2f%n", media);
    }

    public static double calcularMedia(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return (double) soma / array.length;
    }
}   
    
