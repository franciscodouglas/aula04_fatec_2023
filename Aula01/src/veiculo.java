public class veiculo {
    
    // Variaveis 
    public String cor;
    String modelo;
    public int velocidade = 0;

    public int acelerar(int vel_entrada1, int vel_entrada2){
        //variavel interna
        int v=vel_entrada1+vel_entrada2;
        //exibindo a variavel interna
        // System.out.println(v);

        velocidade = velocidade +v;
        return velocidade;
    }
    public void reduzir(){
        velocidade = velocidade -1;
    }
    public void buzinar(){
        System.out.println("Bi-Bi!");
    }

    public String exibirCor(String cor_entrada){
        return cor=cor_entrada;
    }
}
