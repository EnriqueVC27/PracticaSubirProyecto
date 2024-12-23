package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Clases.Peliculas;
import Interfaces.MetodosPeliculas;

public class ImplementacionPeliculas implements MetodosPeliculas
{
	
	private List<Peliculas> listaPeliculas = new ArrayList<Peliculas>();

	@Override
	public void guardar(Peliculas pelicula) 
	{
		listaPeliculas.add(pelicula);
	}

	@Override
	public List<Peliculas> mostrar() 
	{
		 return listaPeliculas;
	}

	@Override
	public Peliculas buscar(int indice) 
	{
		return listaPeliculas.get(indice);
	}

	@Override
	public void editar(int indice, Peliculas pelicula) 
	{
		listaPeliculas.set(indice, pelicula);
	}

	@Override
	public void eliminar(int indice) 
	{
		listaPeliculas.remove(indice);
	}

}
