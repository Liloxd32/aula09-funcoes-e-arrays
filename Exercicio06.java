    // Nome: Davi Fernandes Alves
// Matrícula: 1261946667
    
    
    import java.util.Scanner;
    import java.util.Locale;
    public class App {
    
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
            
    
            double[] notas = new double[5];
    
            System.out.println("=== Sistema de Notas ===");
            
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }

            exibirNotas(notas);
            
            double media = calcularMedia(notas);
            System.out.printf("Média da turma: %.2f%n", media);
            
            double maior = encontrarMaior(notas);
            System.out.println("Maior nota: " + maior);
            
            int totalAprovados = contarAprovados(notas);
            System.out.println("Alunos aprovados: " + totalAprovados);
    
            scanner.close();
        }
    
        public static void exibirNotas(double[] array) {
            System.out.println("--- Notas da Turma ---");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Aluno " + (i + 1) + ": " + array[i]);
            }
        }
    
        public static double calcularMedia(double[] array) {
            double soma = 0;
            for (double n : array) {
                soma += n;
            }
            return soma / array.length;
        }
    
        public static double encontrarMaior(double[] array) {
            double maior = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maior) {
                    maior = array[i];
                }
            }
            return maior;
        }
    
        public static int contarAprovados(double[] array) {
            int contador = 0;
            for (double n : array) {
                if (n >= 6.0) {
                    contador++;
                }
            }
            return contador;
        }
    }
        
    
    
    
