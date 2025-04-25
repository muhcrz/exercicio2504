import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args) {
        //Declaração de variável
        int num; 

     //Criação e instância do objeto de entrada 
    Scanner entrada = new Scanner(System.in);

    //Apresentação
    System.out.println("\n\t\t\t -- Par ou Impar --\n");
    
    //Entrada
    System.out.print("Informe número: ");
    num = entrada.nextInt();

    //Processamento
    /* 
if ((num % 2) != 0){
    System.out.printf("%d é par!", num);
} else {
    System.out.printf("%d é ímpar", num);
}
}
    
}
*/

System.out.println((num % 2)== 0?num + "é par! ":num + "é ímpar");

    }}

    