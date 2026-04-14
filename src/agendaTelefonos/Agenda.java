/**
 * 
 */
package agendaTelefonos;
import java.util.Scanner;
/**
 * 
 */
public class Agenda {

	public static Scanner teclado = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CListaTelefono listaTel= new CListaTelefono();
		
		do {
			int selected = mostrarMenu();
			
			switch (selected) {
				case 1:
					buscar(listaTel);
					break;
				case 2:
					mostrarAgenda(listaTel);
					break;
				case 3:
					annadir(listaTel);
					break;
				case 4:
					eliminar(listaTel);
					break;
				case 5:
					salir();
					break;
			}
		} while(selected==5);
	}

	private static void salir() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminar(listaTel) {
		System.out.println("Introduzca el telefono del usuario a eliminar");
		String telefono = teclado.nextLine();
		
		if () {
			
		}
	}

	private static void annadir(CListaTelefono listaTel) {
		System.out.println("Ingrese el nombre del usuario");
		String nombre= teclado.nextLine();
		
		System.out.println("\nIngrese el email del usuario");
		String email= teclado.nextLine();
		
		System.out.println("\nIngrese el telefono del usuario");
		String telefono= teclado.nextLine();
		
		CPersona usuario= new CPersona(nombre, email, telefono);
		
		listaTel.annadir(usuario);
		
	}

	private static void mostrarAgenda(CListaTelefono listaTel) {
		listaTel.mostrarLista();
		
	}

	private static void buscar(CListaTelefono listaTel) {
		String nombre;
		System.out.println("Ingrese un nombre");
		
		nombre = teclado.nextLine();
		int ind = listaTel.buscar(nombre);
		
		if (ind==-1) {
			System.out.println("Nombre no encontrado");
		} 
		else {
			listaTel.registro(ind);
		}
		
	}

	public static int mostrarMenu() {
		int opcion = -1;
		
		while(!(opcion>=1 && opcion <= 5))
		System.out.println("Menu\n 1.Buscar\n 2.Mostrar Agenda\n 3.Añadir\n 4.Eliminar\n 5.Salir \n\nDame tu opcion: ");
		opcion = Integer.parseInt(teclado.nextLine());
		
		return opcion;
	}
	
	
}
