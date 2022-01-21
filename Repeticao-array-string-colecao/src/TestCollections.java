import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList carrinho = new ArrayList();
		Double valor = 100.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		System.out.println(carrinho.get(1));
		
		// pega o valor do carrinho[2] -> (valor2) e armazena na variavel valor3
		valor3 = (int) carrinho.get(2);
		
		System.out.println(valor3);
		
		//mapear arrays
		//Interface List e uso de Generics
		//Generics não permite tipos primitos
		List<String> carrinho1 = new ArrayList<String>();
		
		// Retorna true, array vazio
		System.out.println(carrinho1.isEmpty());
		
		carrinho1.add("Maça");
		carrinho1.add("Morango");
		carrinho1.add("Maça");
		System.out.println(carrinho1);
		
		// set altera o valor no indice especifico do array
		carrinho1.set(1, "Pera");
		
		// retorna false, array não vazio
		System.out.println(carrinho1.isEmpty());
		// retorna o tamanho do array
		System.out.println(carrinho1.size());
		
		System.out.println(carrinho1);
		
		System.out.println(carrinho1.contains("Maça"));
		System.out.println(carrinho1.indexOf("Maça"));
		System.out.println(carrinho1.get(carrinho1.indexOf("Maça")));
		System.out.println(carrinho1.lastIndexOf("Maça"));
		
		carrinho.remove(carrinho1.indexOf("Maça"));
		System.out.println(carrinho1.get(0));
		
		carrinho.clear();
		System.out.println(carrinho1.isEmpty());
		
		System.out.println(carrinho);
		
		// não permite valores duplicados
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		System.out.println(cesta);
		
		
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("M2225", "Joãozinho");
		caixa.put("M2226", "Cabral");
		caixa.put("M2227", "Nevada");
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M2225"));
		System.out.println(caixa.containsValue("Joãozinho"));
		System.out.println(caixa);
	
	
	
	}

}
