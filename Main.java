class Main{

    public static void main(String args[]){
    //Observações: vetores de usuário e fotos possuem 3 de tamanho

        //Inicializando classe instapet
        Instapet insta = new Instapet();
        
        //Cadastrando Usuarios
        //Usuário[1]
        insta.cadastra_usuario("Anny Caroline", "2021951302@teiacoltec.org");
        //Fotos dos Pet
        insta.cadastra_foto("pet1.com.br", "2021951302@teiacoltec.org", "Luna");
        insta.cadastra_foto("pet2.com.br", "2021951302@teiacoltec.org", "Afrodite");
        insta.cadastra_foto("pet3.com.br", "2021951302@teiacoltec.org", "Atma");

        //Usuário[2]
        insta.cadastra_usuario("Virginia Fonseca", "vivi@teiacoltec.org");
        //Fotos dos Pet
        insta.cadastra_foto("pet_java.com.br", "vivi@teiacoltec.org", "Java");
        insta.cadastra_foto("pet_csharp.com.br", "vivi@teiacoltec.org", "C SharP");
        insta.cadastra_foto("pet_sql.com.br", "vivi@teiacoltec.org", "SQL");

        //Usuário[2]
        insta.cadastra_usuario("João Pessoa", "jp@teiacoltec.org");
        //Fotos dos Pet
        insta.cadastra_foto("pet_pra.com.br", "jp@teiacoltec.org", "Praia");
        insta.cadastra_foto("pet_Prb.com.br", "jp@teiacoltec.org", "Paraiba");
        insta.cadastra_foto("pet_ptri.com.br", "jp@teiacoltec.org", "Patrimonio");

        //Quantidade de Usuário "logados"
        int qnt_ux = 0;
        qnt_ux = insta.qnt_usuarios();

        //Objeto Usuarios
        Usuario auxx[] = new Usuario[qnt_ux];
        for(int i = 0; i < qnt_ux; i++)
            auxx[i] = new Usuario();

        
        //Lista Usuarios
        auxx = insta.listar_usuarios();
        //Imprime Usuarios
        insta.mostra_usuarios(auxx, qnt_ux);
        

        
        //Mostrando Dados
        //Usuário [1]
        //Quantidade de fotos usuário [1]
        int qnt_img = 0;
        qnt_img = insta.qnt_pets("2021951302@teiacoltec.org");

        //Cria novo objeto para fotos
        Fotos aux[] = new Fotos[qnt_img];
        for(int i = 0; i < qnt_img; i++)
            aux[i] = new Fotos();

        //Lista Fotos
        aux = insta.listar_pets("2021951302@teiacoltec.org");
        //Imprime Fotos
        System.out.println("\n\nUsuario[1] " +insta.users[0].nome);
        insta.mostra_pets(aux, qnt_img);

        insta.altera_descricao(0, "2021951302@teiacoltec.org", "Nova Descricao");
        insta.altera_descricao(1, "2021951302@teiacoltec.org", "Nova Descricao");
        insta.altera_descricao(2, "2021951302@teiacoltec.org", "Nova Descricao");

        System.out.println("\n\nUsuario[1] " +insta.users[0].nome);
        insta.mostra_pets(aux, qnt_img);

    }
}