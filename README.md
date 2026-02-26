# Atividade da aula 2 de Java
Nome: Riquelme Santos da Mata  
Turma: CCPH2

## Documentação da atividade realizada na aula 2
A atividade é uma amostra de como criar e utilizar métodos em programação orientada a objetos.  
### Arquivo model

O código model é um modelo da classe Cachorro, com três atributos: nome, idade e peso. A seguir, 
criamos um construtor de classe que executa quando se instancia a classe e, geralmente, usamos para atribuir valores.

```
package br.com.atividade2.model; 

"""
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
```
Usamos um método para definir uma função. Nesse caso, a função é exibirFaixaEtária, que exibe se o cachorro é um animal jovem, adulto ou idoso com base na idade digitada pelo usuário. Essa exibição funciona utilizando o if else para definir
a faixa etária do animal.
```
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
```
### Arquivo main
No arquivo main, temos a estrutura principal do código, onde ele roda e chama a classe. Aqui, criamos um objeto utilizando 
a classe definida no arquivo model e, usando o nome do objeto criado, conseguimos chamar o método definido na classe. Esse método vai mostrar algo diferente dependendo de como o objeto foi criado. Nesse caso, usamos if para mostrar qual a
faixa etária do animal, e então, isso será exibido quando chamado no arquivo main.
```
    Cachorro cachorro1 = new Cachorro("Mike", 10, 15);
    System.out.println("Animal 1");
    cachorro1.exibirFaixaEtaria(10);
    

    Cachorro cachorro2 = new Cachorro("Bob", 2, 5);
    System.out.println("Animal 2");
    cachorro1.exibirFaixaEtaria(2);
```
