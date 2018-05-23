public class Mamifero extends Animal { /*Mamifero está extendendo de animal, é uma herança */

	public Mamifero (String nome){ 
		super (nome); /*chama o construtor do animal, super é o pai no caso o Animal*/
	}

	public void mamar(){
		System.out.print("Eu sou " + this.getNome() );
		System.out.println(" Estou mamando!");
	}
}