import java.util.ArrayList;
import java.util.List;

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

		
		
		//mapear arrays
		//Interface List e uso de Generics
		//Generics não permite tipos primitos
		List<String> carrinho1 = new ArrayList<String>();
		
		System.out.println(carrinho1.isEmpty());
		System.out.println(carrinho1.size());
		
	}

}
