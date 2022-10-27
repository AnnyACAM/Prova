class Usuario {
    String nome;
    String email;
    Fotos imagem[] = new Fotos[3];
    
    void cadastra_foto(String link, String desc){
        int qnt_img = 0;
        qnt_img = qnt_fotos();
        imagem[qnt_img] = new Fotos();
        imagem[qnt_img].descricao = desc;
        imagem[qnt_img].url = link;
    }

    void altera_descricao(int n, String desc){
        imagem[n].descricao = desc;
    }

    int qnt_fotos(){
        int quantd = 0;
        for(int i = 0; i < imagem.length; i++){
        if (imagem[i] == null){
            quantd++;
        }
    }
    quantd = imagem.length - quantd;
        return quantd;
    }

}