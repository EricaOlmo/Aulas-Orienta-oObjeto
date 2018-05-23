public class Exemplo {

	public static void main(String [] args){

		Animal pitoco = new Cachorro("pitoco");
		Animal batman = new Morcego ("bruce");

		System.out.println(pitoco.getNome());
		System.out.println(batman.getNome());
	
		Mamifero pit = (Mamifero) pitoco;
		pit.mamar();

		Morcego bat = (Morcego) batman;
		bat.voar();

		Cachorro c = (Cachorro) pitoco;
		c.latir();	
	}
}