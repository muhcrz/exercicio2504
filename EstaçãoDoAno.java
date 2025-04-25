import java.util.Scanner;
public class EstaçãoDoAno {
    public static void main(String[] args) {
        //declaração de variáveis
        int dia, mes;
        String estacao ="";

        //Criação de instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t -- Verificador de Estações do Ano  --\n");

        //Dados do cliente
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();

        System.out.println("Informe o mês: ");
        mes = entrada.nextInt();
        
        //Verificação de estação
        if ((mes == 3 && dia >= 20) ||(mes == 4 ) || (mes == 5) || (mes == 6 && dia <= 20)) {
            estacao ="Outono";
        }  else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia <= 21)) {
            estacao ="Inverno";
        }else if ((mes == 9 && dia >= 22) || (mes == 10) || (mes == 11) ||(mes == 12 && dia <= 20)) {
            estacao = "verao";
        }
        System.out.println("\nA estação do ano correspondente é " + estacao);

        //saída
        entrada.close();
    }
}
