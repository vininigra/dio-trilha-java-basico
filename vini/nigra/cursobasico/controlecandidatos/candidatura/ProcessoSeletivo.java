package vini.nigra.cursobasico.controlecandidatos.candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.midi.Soundbank;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       String [] candidados = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
       for(String candidato : candidados){
            entrandoEmContato(candidato);
       }
      //  analisarCandidato(1900.0);
      //  analisarCandidato(2200.0);
       // analisarCandidato(2000.0);
    }
    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
            //elas precisarao de modificaçao para nao entrar em um looping infinito
        }while(continuarTentando && tentativaRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato + "Na" + tentativaRealizadas);
        else
            System.out.println("Não conseguimos contato com" + candidato+ "NUmero maximo tentaivar"+ tentativaRealizadas);
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionador(){
        String [] candidados = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidados.length; indice++)
            System.out.println("O candidato de n° " + (indice+1) + " é o " + candidados[indice]);
    
        System.out.println("Forma abreviada de interecao for each");
        for(String candidato: candidados){
            System.out.println("O candidato selecionado foi"+ candidato);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA"," DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " Solicitou este valor de salario" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {

            System.out.println("Ligar para o candidato");
            
        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando o resultado dosdemais candidatos");
        }
    }    
}
