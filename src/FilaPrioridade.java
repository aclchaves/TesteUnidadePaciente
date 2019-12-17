import java.util.PriorityQueue;

public class FilaPrioridade {
	
	PriorityQueue<Paciente> ordemAtenPacientes = new PriorityQueue<>();;	
	
	public FilaPrioridade() {
		super();
		ordemAtenPacientes = new PriorityQueue<>();
	}

	public void addPacienteClassificacao(Paciente paciente) throws FilaPrioridadeException {	
		if(paciente != null) {
			ordemAtenPacientes.add(paciente);
		}else {
			throw new FilaPrioridadeException("Paciente não existe");
		}
				
	}
	
	public Paciente getPaciente() {
		return ordemAtenPacientes.poll();
	}
	
	public Integer geTamanhoFila() {
		return ordemAtenPacientes.size(); 
	}	
	
	@Override
	public String toString() {
		return "FilaPrioridade [ordemAtendimento=" + ordemAtenPacientes + "]";
	}
	

}
