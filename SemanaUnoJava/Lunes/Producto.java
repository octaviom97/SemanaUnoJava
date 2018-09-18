public class Producto
{
	private String nombre;
	private int precio;
	static int contador;
	
	public Producto()
	{
		contador++;
	}

	public Producto(String nombre, int precio)
	{
		setNombre(nombre);
		setPrecio(precio);
		contador++;
	}

	
	public void  setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setPrecio(int precio)
	{
		this.precio = precio;
	}

	public int getPrecio()
	{
		return precio;
	}
	
	public static int getContador()
	{
		return contador;
	}
	
	
}