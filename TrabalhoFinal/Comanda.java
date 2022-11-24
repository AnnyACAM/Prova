public class Comanda{
    private String consumo;
    private double valor;

    public String getConsumo() {
        return consumo;
    }
    
    public double getValor() {
        return valor;
    }

    public void setConsumo(String c) {
        this.consumo = c;
    }

    public void setValor(double v) {
        this.valor = v;
    }

    public double calcular10porcento() {
        double porcent;
        porcent = this.valor / 10; 
        return porcent;
    }

    public double dividirConta(int quantd){
        double v_unit;
        v_unit = this.valor / quantd;
        return v_unit;
    }

    public void listarConsumo(){
        String print;
        print = getConsumo();

        System.out.println(print);
    }
}