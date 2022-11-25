import java.util.Scanner;

class Cliente{
    Scanner scanf = new Scanner(System.in);

    private String nome;
    private String email;
    ComandaBebida bebida = new ComandaBebida();
    ComandaComida comida  = new ComandaComida();

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void add_Bebida(int num_pedido){
       this.bebida.setConsumo(this.bebida.getOpcao(num_pedido));
       this.bebida.setValor(this.bebida.getPreco(num_pedido));
    }

    public void add_Comida(int num_pedido){
        this.comida.setConsumo(this.comida.getOpcao(num_pedido));
        this.comida.setValor(this.comida.getPreco(num_pedido));
     }
     
     public void getComanda(){
        this.comida.listarConsumo();
        this.bebida.listarConsumo();

        double tot_valor = 0.0;
        tot_valor = bebida.getValor() + comida.getValor();
        System.out.println(tot_valor);
     }

}