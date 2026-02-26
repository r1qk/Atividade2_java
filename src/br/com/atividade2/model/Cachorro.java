package br.com.atividade2.model; 

//Classe
public class Cachorro {
    
    // Atributos
    
    public String nome;
    public int idade;
    public double peso;
    
    public Cachorro(String nome, int idade, double peso) {
    	this.nome = nome;
    	this.idade = idade;
    	this.peso = peso;
    }
    

    public void envelhecer (int anos) {
        if (anos < 0) {
            System.out.println("Impossível :/");
            return;
        }
        if (anos == 0) {
            System.out.println("Não envelheceu :D");
            return;
        }

        if (this.idade + anos > 30) {
            System.out.println("Idade máxima atingida :(");
            return;
        }

        this.idade += anos;
        String mensagem = String.format("Seu animal agora tem %d anos! ", idade); 
        System.out.println(mensagem);
        return;
    }

    public void trocarNome (String novo_nome) {
        if (novo_nome == null) {
            System.out.println("Nenhum nome foi digitado :(");
            return;
        }

        if (novo_nome.length() == 1) {
            System.out.println("Digite um nome com mais letras!");
            return;
        }

        this.nome = novo_nome;
        String mensagem2 = String.format("Nome alterado para %s! ", this.nome); 
        System.out.println(mensagem2);
        return;

    }
 
}
