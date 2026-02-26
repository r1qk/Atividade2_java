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
    	this.peso = 0.0;
    }
    
    public void exibirFaixaEtaria (int idade_animal) {
    	if (idade_animal < 3) {
    		System.out.println("Animal Jovem");
    		return;
    	} 
    	
    	if (idade_animal < 10) {
    		System.out.println("Animal Adulto");
    		return;
    	} 
    	
    	if (idade_animal >= 10) {
    		System.out.println("Animal Idoso");
    		return;
    	}
    }
    
    
}
