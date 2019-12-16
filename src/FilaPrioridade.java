import java.util.PriorityQueue;

public class FilaPrioridade {
	
	PriorityQueue<Paciente> ordemAtenPacientes;	
	
	public FilaPrioridade() {
		super();
		ordemAtenPacientes = new PriorityQueue<Paciente>();
	}

	public void addPacienteClassificacao(Paciente paciente) throws FilaPrioridadeException {
		for (Paciente p : ordemAtenPacientes) {
			
		}
		ordemAtenPacientes.add(paciente);		
	}
	
	
	
	@Override
	public String toString() {
		return "FilaPrioridade [ordemAtendimento=" + ordemAtenPacientes + "]";
	}

	public static void main(String[] args) throws FilaPrioridadeException   {
		Paciente p1 = new Paciente("Andre", 33, Classificacao.VERDE);
		Paciente p2 = new Paciente("Renata", 33, Classificacao.AMARELA);
		Paciente p3 = new Paciente("Rafael", 5, Classificacao.VERDE);
		Paciente p4 = new Paciente("Ana", 10, Classificacao.VERMELHA);
		Paciente p5 = new Paciente("Jose", 40, Classificacao.VERMELHA);
		Paciente p6 = new Paciente("Pedro", 55, Classificacao.AMARELA);
		
		
		FilaPrioridade prontoScorro = new FilaPrioridade();
		prontoScorro.addPacienteClassificacao(p1);
		prontoScorro.addPacienteClassificacao(p2);
		prontoScorro.addPacienteClassificacao(p3);
		prontoScorro.addPacienteClassificacao(p4);
		prontoScorro.addPacienteClassificacao(p5);
		prontoScorro.addPacienteClassificacao(p6);
		
		System.out.println(prontoScorro);
		
		
		
	}
	

}
