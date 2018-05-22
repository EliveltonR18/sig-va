import java.time.LocalDate;

public class ClasseTeste {
	public static void main(String[] args) {
		
	LocalDate dataNasc = LocalDate.of(1991, 05, 21);
	LocalDate dataNasci = LocalDate.of(1970, 04, 13);
	LocalDate dataInicio = LocalDate.of(2018, 05, 19);
	LocalDate dataFim = LocalDate.of(2018, 05, 21);
	LocalDate dataComeco = LocalDate.of(2018, 05, 19);
	LocalDate dataTermino = LocalDate.of(2018, 05, 29);
	
	System.out.println("Impressão do teste Pessoa");
	Pessoa aluno = new Pessoa("Arthur", "arthur@gmail.com", 'M', dataNasc,"arthur123","808057538-00");
	System.out.println(aluno.toString());
	
	System.out.println();

	Pessoa aluno1 = new Pessoa();
	aluno1.setNome("Henrique");
	aluno1.setEmail("henrique@gmail.com");
	aluno1.setSexo('M');
	aluno1.setDataNascimento(dataNasci);
	aluno1.setSenha("senha789");
	//cpf
	System.out.println(aluno1.toString());
	System.out.println();
	
	System.out.println("Impressão do teste Tarefa");
	Tarefa tarefa = new Tarefa("Assunto da tarefa: Integrais definidas", dataInicio, dataFim, 01);
	System.out.println(tarefa.toString());
	
	System.out.println();
	
	Tarefa tarefa1 = new Tarefa();
	tarefa1.setDescricao("Tarefa do assunto Grafos");
	tarefa1.setDataInicio(dataComeco);
	tarefa1.setDataTermino(dataTermino);
	tarefa1.setCodigoTarefa(02);
	System.out.println(tarefa1.toString());
	}
	
	
}
