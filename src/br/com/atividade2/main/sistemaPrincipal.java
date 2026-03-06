package br.com.atividade2.main;

//Importamos a classe Cachorro para que o sistema a reconheça
import br.com.atividade2.model.Cachorro;

public class sistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro cachorro (Objeto 1)
    	
    	
        Cachorro cachorro1 = new Cachorro("Mike", 10, 15);
        System.out.println("Animal 1");
        cachorro1.envelhecer(0);
        cachorro1.envelhecer(7);
        cachorro1.trocarNome("A");
        cachorro1.trocarNome("Zeus");
        

        // Criando o segundo cachorro (Objeto 2)
        Cachorro cachorro2 = new Cachorro("Bob", 2, 5);
        System.out.println("Animal 2");
        cachorro2.envelhecer(50);
        cachorro2.envelhecer(6);
        cachorro2.trocarNome("");
        cachorro2.trocarNome("Thor");

        // Exibindo os dados no Console
        System.out.println("--- Exibindo cachorros ---");
        System.out.println("Cachorro: " + cachorro1.nome + " | Idade: " + cachorro1.idade + " | Peso: " + cachorro1.peso);
        System.out.println("Cachorro: " + cachorro2.nome + " | Idade: " + cachorro2.idade + " | Peso: " + cachorro2.peso);
        
    }
}
