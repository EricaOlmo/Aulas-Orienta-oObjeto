public class Animal{

	private String nome;

	public Animal () {

	}

	public Animal (String nome) {   
		this.nome = nome;
		/*this.setNome(nome);*/
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

}