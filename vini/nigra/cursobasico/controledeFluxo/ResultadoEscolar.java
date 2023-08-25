package vini.nigra.cursobasico.controledeFluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        /*int nota=8;

        if (nota >=7)
        System.out.println("Aprovado");

        else
        System.out.println("Reprovado");

        int nota =7;
        String resultado = nota >=7  ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/
        int nota = 3;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);

    }  
}
