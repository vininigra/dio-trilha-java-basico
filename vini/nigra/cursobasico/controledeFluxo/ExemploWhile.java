package vini.nigra.cursobasico.controledeFluxo;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            Double valorDoce = valorAleatorio();
           // nao tem necessidade de colcoar o if, porem sem esse if o valor vai ficar negativo
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicionado no adicionado no carrinho");
            mesada = mesada - valorDoce;
        }   
        System.out.println("Mesada" + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces");
    }
    //criando um metodo para me dar um valor aleatorio entre 2 e 8 para poder colocar no carrinho
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
