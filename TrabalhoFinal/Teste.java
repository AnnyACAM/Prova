public class Teste{
    public static void main(String args[]){
        Cliente AA = new Cliente();

        AA.setNome("NOME LEGAL");
        AA.setEmail("nomelegal@teiacoltec.org");
        AA.add_Bebida("coca", 2.50);
        AA.add_Comida("kibe", 2.50);
        AA.getComanda();
        
    }
}