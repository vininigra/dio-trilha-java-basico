package vini.nigra.cursobasico.controledeFluxo;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno do indice x ="+x+"e"+alunos [x]);
        }
        for(String aluno : alunos){
            System.out.println("NOme do aluno é");
        }
    }   
    
}
