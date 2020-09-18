package exercicioAula17;

public class Cachorro extends Animal{
	
	
	
   public Cachorro(String nome,int idade) {
	   super(nome,idade);
   }
	
	public void emitirSom() {
		System.out.println("Latindoo....");
	}
	public void correr() {
		System.out.println("Correndo latindo e abanado o rabo");
	}
}
