package vini.nigra.cursobasico.estruturasexcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
           System.out.println("O cep nao corresponde com a regras de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!= 8)
            throw new CepInvalidoException();


            return "23.765-064";
    }
}
