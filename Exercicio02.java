 // Nome: Davi Fernandes Alves
// Matrícula: 1261946667
public class App {
     
     public static int somarArray(int[] numeros) {
        int soma = 0; 
        
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; 
        }
        
        return soma; 
    }

    public static void main(String[] args) {
        
        int[] entrada1 = {1, 2, 3, 4, 5};
        int resultado1 = somarArray(entrada1);
        System.out.println("Soma: " + resultado1);

        
        int[] entrada2 = {10, 20, 30};
        int resultado2 = somarArray(entrada2);
        System.out.println("Soma: " + resultado2);
    
      
    }
}
