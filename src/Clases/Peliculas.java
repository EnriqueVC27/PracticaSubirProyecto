package Clases;

public class Peliculas 
{
	private String nombre;
	private String tipo;
	private float duracion;
	private float precio;
	
	public Peliculas()
	{
		
	}

	public Peliculas(String nombre, String tipo, float duracion, float precio) 
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.duracion = duracion;
		this.precio = precio;
	}

	@Override
	public String toString() 
	{
		return "Peliculas [nombre=" + nombre + ", tipo=" + tipo + ", duracion=" + duracion + ", precio=" + precio + "]\n";
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public float getDuracion() 
	{
		return duracion;
	}

	public void setDuracion(float duracion) 
	{
		this.duracion = duracion;
	}

	public float getPrecio() 
	{
		return precio;
	}

	public void setPrecio(float precio) 
	{
		this.precio = precio;
	}
	
	
	
	
}
