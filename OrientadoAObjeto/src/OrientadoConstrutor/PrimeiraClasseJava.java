package OrientadoConstrutor;

import javax.swing.JOptionPane;

import orientando.Aluno;

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
		
		String disciplina1 = JOptionPane.showInputDialog("Qual é a Disciplina 1?:");
		String nota1 = JOptionPane.showInputDialog("Qual é a primeira nota do aluno?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?:");
		String nota2 = JOptionPane.showInputDialog("Qual é a segunda nota do aluno?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?:");
		String nota3 = JOptionPane.showInputDialog("Qual é a terceira nota do aluno?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?:");
		String nota4 = JOptionPane.showInputDialog("Qual é a quarta nota do aluno?");
		

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
		
		System.out.println(aluno1);/*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " +aluno1.getMediaNota());
		System.out.println("Resultado = " +aluno1.getAlunoAprovado2());
		
	}
}
