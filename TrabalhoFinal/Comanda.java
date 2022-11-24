public abstract class Comanda{
    private String consumo[]= new String[10];
    private double valor;

    public String getConsumo(int i) {
        return consumo[i];
    }
    
    public double getValor() {
        return valor;
    }

    public void setConsumo(String c) {
        int consumidos;
        consumidos = consumidos();
        if(consumidos < consumo.length){
        this.consumo[consumidos] = c;
        }
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
        int consumidos;
        consumidos = consumidos();
        for(int i = 0; i < consumidos; i++){
        print = getConsumo(i);
        System.out.println(print);
        }
    }

    int consumidos(){
        int qntd_cons = 0;
        for(int i = 0; i < consumo.length; i++){
        if (consumo[i] == null){
            qntd_cons++;
        }
    }
    qntd_cons = consumo.length - qntd_cons;
        return qntd_cons;
    }
}