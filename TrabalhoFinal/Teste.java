class Teste{
    public static void main(String args[]){
        Cliente AA = new Cliente();

        AA.setNome("NOME LEGAL");
        AA.setEmail("nomelegal@teiacoltec.org");
        AA.bebida.Cardapio();
        AA.comida.Cardapio();
        AA.add_Bebida(2);
        AA.add_Comida(2);
        AA.setComanda(1, 1);
        AA.getComanda();
        
    }
}