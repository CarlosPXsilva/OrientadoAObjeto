package OrientadoConstrutor;

import javax.swing.JOptionPane;

import orientando.Aluno;

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
		
		String disciplina1 = JOptionPane.showInputDialog("Qual � a Disciplina 1?:");
		String nota1 = JOptionPane.showInputDialog("Qual � a primeira nota do aluno?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?:");
		String nota2 = JOptionPane.showInputDialog("Qual � a segunda nota do aluno?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?:");
		String nota3 = JOptionPane.showInputDialog("Qual � a terceira nota do aluno?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?:");
		String nota4 = JOptionPane.showInputDialog("Qual � a quarta nota do aluno?");
		

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
		
		System.out.println(aluno1);/*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " +aluno1.getMediaNota());
		System.out.println("Resultado = " +aluno1.getAlunoAprovado2());
		
	}
}
