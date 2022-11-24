class Instapet{
    Usuario users[] = new Usuario[3];

    void cadastra_usuario(String nome, String email){
        int qnt_ux = 0;
        qnt_ux = qnt_usuarios();
        users[qnt_ux] = new Usuario();
        users[qnt_ux].nome = nome;
        users[qnt_ux].email = email;
    }

    void cadastra_foto(String link, String email,String desc){
        int indc_ux = 0;
        indc_ux = email_indice(email);
        users[indc_ux].cadastra_foto(link, desc);
    }

    int qnt_pets(String email){
        int indc_ux = 0;
        int quantd = 0;
        indc_ux = email_indice(email);
        for(int i = 0; i < users[indc_ux].imagem.length; i++){
        if (users[indc_ux].imagem[i] == null){
            quantd++;
        }
    }
        quantd = users[indc_ux].imagem.length - quantd;
        return quantd;
    }
    

    int qnt_usuarios(){
        int quantd = 0;
        for(int i = 0; i < users.length; i++){
        if (users[i] == null){
            quantd++;
        }
    }
    quantd = users.length - quantd;
        return quantd;
    }

    Fotos[] listar_pets(String email){
        int indc_ux = 0;
        indc_ux = email_indice(email);

        return users[indc_ux].imagem;
    }

    void mostra_pets(Fotos u[], int tam){
        for (int i = 0; i < tam; i++){
            System.out.print("\nFoto  " +i);
            System.out.print("\nDescricao:");
            System.out.println(u[i].descricao);
            System.out.print("Link:");
            System.out.println(u[i].url);
        }
    }

    Usuario[] listar_usuarios(){
        return users;
    }

    void mostra_usuarios(Usuario us[], int tam){
        for (int i = 0; i < tam; i++){
            System.out.print("\nUsuario  " +i);
            System.out.print("\nEmail:");
            System.out.println(us[i].email);
            System.out.print("Nome:");
            System.out.println(us[i].nome);
        }
    }

    void altera_descricao(int n,String email, String desc){
        int indc_ux = 0;
        indc_ux = email_indice(email);
        users[indc_ux].altera_descricao(n, desc);
    }

    int email_indice(String email){
        int indice = 0;
        int qnt_ux = 0;
        qnt_ux = qnt_usuarios();
        for(int i = 0; i < qnt_ux; i++)
        if (email == users[i].email){
            indice = i;
            return indice;
        }
        return 1000;
    }
}