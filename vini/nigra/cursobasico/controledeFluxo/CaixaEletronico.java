package vini.nigra.cursobasico.controledeFluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        }
        
        else if(saldo >=5 && saldo < 7)
        System.out.println("Prova Recuperação");
    
       
        else 
            System.out.println("Saldo insuficiente");
        
            System.out.println(saldo);
    }
}
