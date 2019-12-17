
public class RunApplication {
	
	public static void main(String[] args) throws FilaPrioridadeException   {
		Paciente p1 = new Paciente("Renata", 33, Classificacao.AMARELA);
		Paciente p2 = new Paciente("Andre", 33, Classificacao.VERDE);		
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
