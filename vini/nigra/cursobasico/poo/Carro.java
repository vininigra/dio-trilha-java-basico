public class Carro extends  Veiculo{  //Extends herda da classe para para a classe filho os metodos e atributos
    
    //encapsular os metodos publicos para privado para que quando eu fizer a chamada de ligar ele ja faça o confereCombustiveis e confereCambio


        public void ligar(){
            System.out.println("Carro Ligado");
            confereCambio();
            confereCombustivel();
        }
        private void confereCombustivel(){
            System.out.println("Confere Combustivel");
        }
        private void confereCambio(){
            System.out.println("Confere Cambio");
        }
    }


