public class Empleado
{
	private String puesto;
	private String nombre;
	private int sueldo;
	static int contador;

	public Empleado()
	{
		contador++;
	}
	
	public Empleado(String puesto, String nombre, int sueldo)
	{
		this.puesto = puesto;
		this.nombre = nombre;
		this.sueldo = sueldo;
		contador++;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}

	public void setSueldo(int sueldo)
	{
		this.sueldo = sueldo;
	}

	public int getSueldo()
	{
		return sueldo;
	}
	
	public static int getContador()
	{
		return contador;
	}
	
	
}