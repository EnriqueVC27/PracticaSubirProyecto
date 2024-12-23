package Main;

import java.util.Scanner;

import Clases.Peliculas;
import Implementacion.ImplementacionPeliculas;

public class Principal {

	public static void main(String[] args) 
	{
		String nombre;
		String tipo;
		float duracion;
		float precio;
		int menuPrincipal, subMenu, indice;
		
		Peliculas pelicula = null;		
		Scanner lectura = null;
		
		ImplementacionPeliculas imp = new ImplementacionPeliculas();
		
		do
		{
			System.out.println("MENÚ PELICULAS");
			System.out.println("1.- AGREGAR PELICULAS");
			System.out.println("2.- MOSTRAR PELICULAS");
			System.out.println("3.- BUSCAR PELICULAS");
			System.out.println("4.- EDITAR PELICULAS");
			System.out.println("5.- ELIMINAR PELICULAS");
			System.out.println("6.- SALIR");
			
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();
			
			switch (menuPrincipal) 
			{
			case 1
			:
				try
				{
				System.out.println("INGRESO DE PELICULAS");
				
				System.out.println("INGRESE NOMBRE:");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				System.out.println("INGRESE TIPO:");
				lectura = new Scanner(System.in);
				tipo = lectura.nextLine();
					
				System.out.println("INGRESE DURACION:");
				lectura = new Scanner(System.in);
				duracion = lectura.nextFloat();
				
				System.out.println("INGRESE PRECIO:");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();
				
				pelicula = new Peliculas(nombre, tipo, duracion, precio);
				
				imp.guardar(pelicula);
				
				System.out.println("REGISTRO GUARDADOP CON EXITO");
				}
				catch (Exception e) 
				{
					System.out.println("ERROR AL GUARDAR: ");
				}
				
				break;
			case 2:
				
				if(imp.mostrar().size() == 0)
				{
					System.out.println("NO SE ENCONTRARON REGISTROS");
				}
				else 
				{
					System.out.println(imp.mostrar());
				}
				
				break;
			case 3:
				
				try 
				{

					System.out.println("INGRESE INDICE A BUSCAR:");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					if(indice > imp.mostrar().size())
					{
						System.out.println("REGISTRO NO EXISTE");
					}
					else
					{
						System.out.println(imp.buscar(indice));
					}					
					
				} 
				catch (Exception e) 
				{
					System.out.println("REGISTRO NO EXISTE, INTENTE NUEVAMENTE");
				}
	
				break;
			case 4:
				try 
				{
					System.out.println("INGRESE INDICE A MODIFICAR:");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					pelicula = imp.buscar(indice);
					
					do 
					{
						System.out.println("1.- MODIFICAR TIPO");
						System.out.println("2.- MODIFICAR PRECIO");
						System.out.println("3.- SALIR");
						
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();
						
						switch (subMenu) 
						{
						case 1:
							
							try 
							{
								System.out.println("INGRESE NUEVO TIPO");
								lectura = new Scanner(System.in);
								tipo = lectura.nextLine();
								pelicula.setTipo(tipo); 
								
								imp.editar(indice, pelicula);
								System.out.println("MODIFICADO CON EXITO");
								
							}
							catch (Exception e) 
							{
								System.out.println("ERROR AL MODIFICAR TIPO");
							}
							
							break;
						case 2:
							
							try 
							{
								System.out.println("INGRESE NUEVO PRECIO");
								lectura = new Scanner(System.in);
								precio = lectura.nextFloat();
								pelicula.setPrecio(precio); 
								
								imp.editar(indice, pelicula);
								System.out.println("MODIFICADO CON EXITO");
								
							}
							catch (Exception e) 
							{
								System.out.println("ERROR AL MODIFICAR PRECIO");
							}
							
							break;
						}
					}while (subMenu < 3);
					
				}
				catch (Exception e) 
				{
					System.out.println("ERROR AL EDITAR");
				}
				break;
			case 5:
				try 
				{
					System.out.println("INGRESE INDICE A :");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					pelicula = imp.buscar(indice);
					
					imp.eliminar(indice);
					System.out.println("SE ELIMINÓ CON EXITO");
					if(indice == imp.mostrar().size())
					{
						System.out.println("NO HAY REGISTROS");
					}
					else
					{
						System.out.println(imp.mostrar());
					}
					
				}
				catch (Exception e) 
				{
					System.out.println("ERROR AL ELIMINAR");
				}
				break;
			}
			
		}
		while(menuPrincipal < 6);
		
		
	}

}
