import java.util.Scanner;

public class Datasigno {
    public static void main(String[] args) {
        //Declaração de variáveis
        int dia, mês;
        String signo ="";

        //Criação e instância do objeto de entrada 
    Scanner entrada = new Scanner(System.in);

    //Apresentação
    System.out.println("\n\t\t\t -- Verificador de Signo --\n");

    //Entrada 
    System.out.print("Informe seu dia de nascimento: ");
    dia = entrada.nextInt();
    System.out.print("Informe seu mês de nascimento: ");
    mês = entrada.nextInt();

    //Processamento

    if ((dia >= 21 && mês == 3) || (dia <= 19 && mês == 4)) {
        signo = "Áries";
    } else if ((dia >= 20 &&  mês == 4) || (dia <= 20 && mês == 5)) {
        signo = "Touro";
    }else if ((dia >= 21 && mês == 5) || (dia <= 20 && mês == 6)) {
        signo = "Gêmeos";
    }else if ((dia >= 22 && mês == 6) || (dia <= 22 && mês == 7)) {
        signo = "Câncer";
    }else if ((dia >= 23 && mês == 7) || (dia <= 22 && mês == 8)) {
        signo = "Leão";
    }else if ((dia >=23  && mês == 8) || (dia <= 22 && mês == 9)) {
        signo = "Virgem";
    }else if ((dia >=23  && mês == 9) || (dia <= 22 && mês == 10)) {
        signo = "Libra";
    }else if ((dia >=23  && mês == 10) || (dia <= 21 && mês == 11)) {
        signo = "Escorpião";
    }else if ((dia >=22  && mês == 11) || (dia <= 21 && mês == 12)) {
        signo = "Sagitário";   
    }else if ((dia >=22  && mês == 12) || (dia <= 19 && mês == 1)) {
        signo = "Capricórnio";
    }else if ((dia >=20  && mês == 1) || (dia <= 18 && mês == 2)) {
        signo = "Aquário";
    }else if ((dia >=19  && mês == 2) || (dia <= 20 && mês == 3)) {
        signo = "Peixes";
    } else {
        signo = "Inválido (data incorreta)";
    }
   
   
        //Saída 
    System.out.println("Seu Signo é " + signo);

}}

