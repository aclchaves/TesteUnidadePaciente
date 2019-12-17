import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class FilaPrioridadeTest {

    private FilaPrioridade fila;

    @Before
    public void init() {
        fila = new FilaPrioridade();
    }
    
    @Test(expected = FilaPrioridadeException.class)
	public void testaClassificacaoPacienteNegativo() throws FilaPrioridadeException {
		fila.addPacienteClassificacao(null);
	}

    @Test
    public void testaClassificacao() throws FilaPrioridadeException {
    	
    	Paciente p1 = new Paciente("Renata", 33, Classificacao.VERDE);
    	fila.addPacienteClassificacao(p1);
    	
		Paciente p2 = new Paciente("Andre", 33, Classificacao.VERMELHA);
		fila.addPacienteClassificacao(p2);
		
		Paciente p3 = new Paciente("Rafael", 5, Classificacao.AMARELA);
		fila.addPacienteClassificacao(p3);
		
		Paciente p4 = new Paciente("Ana", 10, Classificacao.VERMELHA);
		fila.addPacienteClassificacao(p4);
		
		Paciente p5 = new Paciente("Jose", 40, Classificacao.AMARELA);
		fila.addPacienteClassificacao(p5);
		
		Paciente p6 = new Paciente("Pedro", 55, Classificacao.VERDE);
		fila.addPacienteClassificacao(p6);
    	       

        Paciente r1 = fila.getPaciente();
        Paciente r2 = fila.getPaciente();
        Paciente r3 = fila.getPaciente();
        Paciente r4 = fila.getPaciente();
        Paciente r5 = fila.getPaciente();
        Paciente r6 = fila.getPaciente();

        assertEquals(Classificacao.VERMELHA, r1.getRisco());
        assertEquals(Classificacao.VERMELHA, r2.getRisco());
        assertEquals(Classificacao.AMARELA, r3.getRisco());
        assertEquals(Classificacao.AMARELA, r4.getRisco());
        assertEquals(Classificacao.VERDE, r5.getRisco());
        assertEquals(Classificacao.VERDE, r6.getRisco());
    }

}
