package br.com.streaming.main;
import br.com.streaming.model.Usuario;
// TODO: Fazer imports das classes dos pacotes model e financeiro

public class MainTeste {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE STREAMING ===");
        System.out.println(); // pula linha.
        Usuario u1 = new Usuario(null, null);
        u1.setNome("Joao Silva");
        u1.setEmail("joao@email.com");
        Usuario u2 = new Usuario(null, null);
        u2.setNome("Marcos");
        u2.setEmail("marcos1@email.com");
        Usuario u3 = new Usuario(null, null);
        u3.setNome("Bob");
        u3.setEmail("Bob@email.com");

        System.out.println(u1);
        System.out.println();
        System.out.println(u2);
        System.out.println();
        System.out.println(u3);
        System.out.println();
        // agora estavamos usando objetos agora printamos usando uma classe.
        System.out.println(Usuario.NOME_PLATAFORMA);
        System.out.println();
        // contador slide 43.
        System.out.println("Total de Contas: " + Usuario.contadorUsuarios);
        System.out.println();
        // TODO: Testes da Aula 2 e 3
// codigo esta comparando as casas no caso (new) usar equals compara strings ai so caso estamos comparando objetos. 
    if (u1.equals(u2)) {
        System.out.println("Erro: Usuário já existe!");
        System.out.println();
        }else {
        System.out.println("Cadastro liberado!");
        System.out.println();
    }  
}

}
      

