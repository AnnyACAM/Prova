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
    if(num_pedido < this.bebida.quantd_bebidas()){
       this.bebida.setConsumo(this.bebida.getOpcao(num_pedido));
       this.bebida.setValor(this.bebida.getPreco(num_pedido));
    }else{
        System.out.print("Opcao nao existe");
    }
    }

    public void add_Comida(int num_pedido){
        if(num_pedido < this.comida.quantd_comidas()){
        this.comida.setConsumo(this.comida.getOpcao(num_pedido));
        this.comida.setValor(this.comida.getPreco(num_pedido));
        }else{
            System.out.print("Opcao nao existe");
        }
     }

     public void setComanda(int qntd_comida, int qntd_bebida){
        for(int i = 0; i < qntd_comida; i++){
            System.out.println("Num Comida:");
            i = scanf.nextInt();
            add_Comida(i);
        }
        for(int i = 0; i < qntd_bebida; i++){
            System.out.println("Num Bebida:");
            i = scanf.nextInt();
            add_Bebida(i);
        }
     }
     
     public void getComanda(){
        System.out.println("--- Comanda ---");
        System.out.println("-> Comidas");
        this.comida.listarConsumo();
        System.out.println("\n-> Bebidas");
        this.bebida.listarConsumo();

        double tot_valor = 0.00;
        tot_valor = bebida.getValor() + comida.getValor();
        System.out.println("\n Valor Total = R$" + tot_valor);
     }

}