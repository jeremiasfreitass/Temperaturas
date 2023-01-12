import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Main {
    public static void main(String[] args) {
        double temperatura = 0;
        double soma = 0;

        List<Mes> temperaturas = new ArrayList<>();

        System.out.println("Digite a temperatura média do mês solicitado: ");
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i < 7; i++){
            switch (i){
                case 1:
                    System.out.println("Janeiro: ");
                    double temperaturaJaneiro = ler.nextDouble();
                    temperaturas.add(new Mes("Janeiro", temperaturaJaneiro));
                    soma += temperaturaJaneiro;
                    break;
                case 2:
                    System.out.println("Fevereiro: ");
                    double temperaturaFevereiro = ler.nextDouble();
                    temperaturas.add(new Mes("Fevereiro", temperaturaFevereiro));
                    soma += temperaturaFevereiro;
                    break;
                case 3:
                    System.out.println("Março: ");
                    double temperaturaMarco = ler.nextDouble();
                    temperaturas.add(new Mes("Marco", temperaturaMarco));
                    soma += temperaturaMarco;
                    break;
                case 4:
                    System.out.println("Abril: ");
                    double temperaturaAbril = ler.nextDouble();
                    temperaturas.add(new Mes("Abril", temperaturaAbril));
                    soma += temperaturaAbril;
                    break;
                case 5:
                    System.out.println("Maio: ");
                    double temperaturaMaio = ler.nextDouble();
                    temperaturas.add(new Mes("Maio", temperaturaMaio));
                    soma += temperaturaMaio;
                    break;
                case 6:
                    System.out.println("Junho: ");
                    double temperaturaJunho = ler.nextDouble();
                    temperaturas.add(new Mes("Junho", temperaturaJunho));
                    soma += temperaturaJunho;
                    break;
            }
        }
        double media = soma/6;
        System.out.printf("\nMédia semestral: %.1f", media);

        System.out.println("\n\n Meses que a temperatura foi maior que a média: ");
        for (Mes temp : temperaturas) {
            if(temp.getTemperatura() > media){
                System.out.println(temp.toString());
            }
        }

    }
}

class Mes{
    String mes;
    Double temperatura;

    public Mes(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Mes: " + mes + " Temperatura: " + temperatura;
    }
}