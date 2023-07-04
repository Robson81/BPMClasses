package classesBPM;

public class Matrizes {
	
	private Integer numero;
	private char sexo;
	private String nome;
	private Integer idade;

	public Matrizes() {
		
	}
	
	public Matrizes(char sexo, String nome, Integer numero) {
		this.sexo = sexo;
		this.nome = nome;
		this.idade = numero;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		
		this.numero = numero;
	}

	public char getSexo() {
		return sexo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public String toString() {
		
		
		return "Nome: " + nome + ", Idade: " + idade + ", Genero: " + sexo;
	}


	
}
