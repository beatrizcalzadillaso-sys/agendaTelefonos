/**
 * 
 */
package agendaTelefonos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */
public class CListaTelefono {

	private ArrayList<CPersona> lstPersonas;
	
	
	public CListaTelefono() {
		lstPersonas = new ArrayList<CPersona>(100);		
	}
	
	/**
	 * Añade una nueva persona a la lista de personas
	 * @param p => objeto CPersona
	 */
	public void annadir(CPersona p) {
		lstPersonas.add(p);
	}
	
	
	public boolean eliminar (String tel) {
		boolean eliminado = false;
		
		Iterator<CPersona> itPersona = lstPersonas.iterator();
		while(itPersona.hasNext() && !eliminado) {
			CPersona cp =  itPersona.next();
			
			if (tel.equals(cp.getTelefono())) {
				itPersona.remove();
				eliminado = true;
			}
		}
		
		return eliminado;
	}
	
	
	public int buscar (String nombre) {
		int posicion = -1;
		
		Iterator<CPersona> itPersonas = lstPersonas.iterator();
		
		while(itPersonas.hasNext() && posicion ==-1) {
			
			CPersona cp = itPersonas.next();
			
			if(nombre.equals(cp.getNombre())) {
				posicion = lstPersonas.indexOf(cp);
			}
		}
		
		return posicion;
	}
	
	/**
	 * Busca persona por indice
	 * @param int i indice para buscar
	 * @return objeto CPersona
	 */
	public CPersona registro(int i) {
		CPersona encontrado = null;
		
		if(!lstPersonas.isEmpty() && i < lstPersonas.size()) {
			encontrado = lstPersonas.get(i);
		}
		
		else {System.out.println("Error, fuera de los limites");
		}
		
		return encontrado;
	}
	
	/**
	 * Devuelve el numero de personas en la lista
	 * @return entero tamaño de la lista
	 */
	public int longitud () {
		return (lstPersonas.size()); 
	}
	
	/**
	 * imprime los datos de las personas en la lista
	 */
	public void mostrarLista() {
		
		Iterator<CPersona> itPersona = lstPersonas.iterator();
		if (!lstPersonas.isEmpty()) {
			while(itPersona.hasNext()) {
				CPersona cp = itPersona.next();
				System.out.println(cp.toString());
			}
		} else {System.out.println("La lista esta vacia");}
	}
}
