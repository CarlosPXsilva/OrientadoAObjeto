package OrientadoConstrutor;

import javax.swing.JOptionPane;

import orientando.Aluno;
import orientando.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		/* new Aluno() � uma instancia ou cria��o de objeto */
		/* aluno1 � uma referencia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual � o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual � a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual � data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual � o rg do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual � o numero do cpf aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual � o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual � data da matricula do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual � serie de matrucla do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual � o nome da escola do aluno?");
		
	
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
		
		System.out.println(aluno1);/*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " +aluno1.getMediaNota());
		System.out.println("Resultado = " +aluno1.getAlunoAprovado2());
		
	}
	
	
}
