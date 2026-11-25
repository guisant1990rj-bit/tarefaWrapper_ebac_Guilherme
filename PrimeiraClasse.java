/**
 * 
 */
package tarefaWrapper;

/**
 * 
 */
public class PrimeiraClasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero numero = new Numero();
		numero.setValor(10);
		
		int primitivo = numero.getValor();
		Integer wrapper = primitivo;
		
		System.out.println("Primitivo: " + primitivo);
		System.out.println("Wrapper: " + wrapper);

	}

}
