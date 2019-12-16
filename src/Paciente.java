
public class Paciente implements Comparable<Paciente>{
	
	private String nome;
	private int idade;
	private Classificacao risco;	
	
	public Paciente() {	}

	public Paciente(String nome, int idade, Classificacao risco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.risco = risco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Classificacao getRisco() {
		return risco;
	}
	
	public void setRisco(Classificacao risco) {
		this.risco = risco;
	}	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((risco == null) ? 0 : risco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (risco != other.risco)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", risco=" + risco + "]";
	}

	@Override
	public int compareTo(Paciente paciente) {
		if(this.risco.getCode() >= paciente.getRisco().getCode()) {
			return 1;
		}else if(this.risco.getCode() < paciente.getRisco().getCode()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	

}
