package OrientadoConstrutor;

import javax.swing.JOptionPane;

import orientando.Aluno;
import orientando.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		/* new Aluno() é uma instancia ou criação de objeto */
		/* aluno1 é uma referencia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual é data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual é o rg do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual é o numero do cpf aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual é o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual é data da matricula do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual é serie de matrucla do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola do aluno?");
		
	
		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		
		for(int pos = 1; pos <=4; pos++) {
		
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" +pos+ " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina)); 
			
			aluno1.getDisciplina().add(disciplina);
		}
		
		System.out.println(aluno1);/*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " +aluno1.getMediaNota());
		System.out.println("Resultado = " +aluno1.getAlunoAprovado2());
		
	}
	
	
}
