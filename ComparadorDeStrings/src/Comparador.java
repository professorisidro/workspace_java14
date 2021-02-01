
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = "Oi, tudo bem? Vem sempre aqui?";
		s2 = "Oi, tudo bem? Vem sempre aqui?";
		
		if (s1 == s2) {
			System.out.println("Apontam para a mesma área da memória");
		}
		else {
			System.out.println("Apontam para áreas de memória distintas");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Mesmo conteúdo lexicografico");
		}
		else {
			System.out.println("Conteúdos lexicograficos distintos");
		}
		
		// se s1 e s2 são objetos, tudo o que eu alterar via s2, reflete em s1
		
		s2 = "Agora vai...";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		
		
	}

}
