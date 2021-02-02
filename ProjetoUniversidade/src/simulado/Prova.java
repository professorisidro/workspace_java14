package simulado;

import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String minhaResposta;
		int    pontos=0;
		
		QuestaoSimples questoes[];
		questoes = new QuestaoSimples[5];
		
		questoes[0] = new QuestaoSimples("Quem descobriu o Brasa?","PA Cabral");
		questoes[1] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleao?","Marrom","Cuidado com o nome");
		questoes[2] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA");
		questoes[3] = new QuestaoMultiplaEscolha("Qual a formula da água?","H2O","NaCl","H2O","H2O2","H2SO4");
		questoes[4] = new QuestaoSimples("Quem joga como nunca e perde como sempre?","XV de Jau");
		
		/* versao 1.0 For manual - 100% de controle 
		for (int pos = 0; pos < questoes.length; pos++) {
		
		
			System.out.println(questoes[pos].aplicarQuestao());
			System.out.print("Resposta: ");
			minhaResposta = teclado.nextLine();
			if (questoes[pos].corrigir(minhaResposta)) {
				pontos++;
			}
			else {
				System.out.println("Errooooooooouuu (Imagine Fausto Silva dizendo)");
			}
		}
		*/
		
		
		/* versao 2.0 "For EACH" - a máquina virtual controla cada etapa do loop 
		 * como esse "for" é lido: Para cada objeto Q do tipo QuestaoSimples dentro da lista "questoes" 
		 */
		
		for (QuestaoSimples q: questoes) {
			
			System.out.println(q.aplicarQuestao());
			System.out.println("Resposta: ");
			minhaResposta = teclado.nextLine();
			if (q.corrigir(minhaResposta)) {
				pontos++;
			}
			
		}
		
		
		System.out.println("Voce fez um total de "+pontos+" pontos");
		
	}
}
