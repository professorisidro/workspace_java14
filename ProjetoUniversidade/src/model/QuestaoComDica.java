package model;

public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+"\n"+
	           "  Dica: "+this.dica;
	}

}
