import java.util.Scanner;

public class ProgramaIniciante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int somaIdadeMulheres = 0;
        int quantidadeMulheres = 0;
        int quantidadeCasados = 0;
        int quantidadeSolteiros = 0;
        
        int contador = 1;
        
        while (contador <= 5) {
            System.out.println("--- Pessoa " + contador + " ---");
            
            System.out.print("Digite o sexo (M ou F): ");
            String sexo = teclado.next();
            
            System.out.print("Digite a idade: ");
            int idade = teclado.nextInt();
            
            System.out.print("Estado civil (1 para Casado, 2 para Solteiro): ");
            int estado = teclado.nextInt();
            
            if (sexo.equalsIgnoreCase("F")) {
                somaIdadeMulheres = somaIdadeMulheres + idade;
                quantidadeMulheres = quantidadeMulheres + 1;
            }
            
            if (estado == 1) {
                quantidadeCasados = quantidadeCasados + 1;
            }
            if (estado == 2) {
                quantidadeSolteiros = quantidadeSolteiros + 1;
            }
            
            contador = contador + 1;
            System.out.println();
        }
        
        System.out.println("RESULTADO FINAL");
        
        
    }
}