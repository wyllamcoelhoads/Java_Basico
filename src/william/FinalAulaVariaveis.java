package william;

public class FinalAulaVariaveis {
    public static void main(String[] args) {
        int nivelDeEntendimento;
        System.out.println("Seu nivel de entendimento em uma escala de 0 a 5, paa 0 não entendeu e 5 entendeu e fez exercicio");
        nivelDeEntendimento = 4;
        Aprendi(nivelDeEntendimento);
    }

    public static void Aprendi(int valor){
        if (valor >= 5) {
            System.out.println("-------------------------------------------");
            System.out.println("Eu aprendi sobre variaveis e usos dos metodos e fiz exercicios");
            System.out.println("NIvel de entendimento: ".concat(String.valueOf(valor)));
        }
        else if(valor < 5) {
            System.out.println("-------------------------------------------");
            System.out.println("Eu apenas entendi mas não fiz exercicios");
            System.out.println("Nivel de entendimento: ".concat(String.valueOf(valor)));
        }
        else
                System.out.println("-------------------------------------------");
                System.out.println("Entendi!");
                System.out.println("Nivel de entendimento: ".concat(String.valueOf(valor)));
            }
        }
