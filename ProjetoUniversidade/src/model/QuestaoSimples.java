package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: "+this.enunciado;
	}
	
	public boolean corrigir(String respUsuario) {
		return  respUsuario.equals(resposta);
	}

	public String getResposta() {
		return resposta;
	}
}
