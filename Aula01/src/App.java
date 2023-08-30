public class App {
    public static void main(String[] args) throws Exception {
        veiculo gol  = new veiculo();
        veiculo astra = new veiculo();
        //variavel global
        // gol.velocidade=100;


        gol.cor="Azul";
        gol.modelo="G3";
        gol.buzinar();
        //variavel do parametro
        // gol.acelerar(100,50);
        System.out.println("A velocidade é:"+
        gol.acelerar(10, 50));
        int v =50+ gol.acelerar(10, 50);
        
        // gol.reduzir();
        System.out.println("A velocidade é:"+ v);

        System.out.println("A velocidade é:"+ astra.acelerar(0, 0));
       
        System.out.println(gol.exibirCor("Amarelo"));
        System.out.println(astra.exibirCor("Vermelho"));
        
    }
}
