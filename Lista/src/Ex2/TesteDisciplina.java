package Ex2;

public class TesteDisciplina {
	public static void main(String[] args) {
		Disciplina disciplina = new Disciplina(0, null, null, null, null);
		
		disciplina.setCodigo(0);
		disciplina.setNome("Maicon");
		disciplina.setCargaHoraria(12.5);
		disciplina.setModalidade("Presencial");
		disciplina.setConteudoPragmatico("Reprovar todos");
		
		disciplina.exibirRelatorio();
	
		
	
	}
}
