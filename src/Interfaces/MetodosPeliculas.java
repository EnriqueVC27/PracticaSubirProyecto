package Interfaces;

import java.util.List;

import Clases.Peliculas;

public interface MetodosPeliculas 
{
public void guardar (Peliculas casa);
	
	public List<Peliculas> mostrar();
	
	public Peliculas buscar (int indice);
	
	public void editar (int indice, Peliculas casa);
	
	public void eliminar (int indice);

}
