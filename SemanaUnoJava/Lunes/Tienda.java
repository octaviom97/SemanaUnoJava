public class Tienda
{
	private String direccion;
	private int dinero;
	private int contadorProducto=4;
	private int contadorEmpleado=4;
	static  int contadorTienda;

	public Tienda()
	{
		Producto p1 = new Producto("Pan", 30);
        Producto p2 = new Producto("Cereal", 30);
		Producto p3 = new Producto("Coca", 30);
		Producto p4 = new Producto("Sabritas", 30);
		Empleado e1 = new Empleado("Gerente", "Karina", 8000);
		Empleado e2 = new Empleado("Empleado", "Jorge", 4000);
		Empleado e3 = new Empleado("Empleado", "Poli", 4000);
		Empleado e4 = new Empleado("Empleado", "Octavio", 4000);
		contadorTienda++;
	}
	
	public Tienda(String direccion, int dinero)
	{
        Producto p1 = new Producto("Pan", 30);
        Producto p2 = new Producto("Cereal", 30);
		Producto p3 = new Producto("Coca", 30);
		Producto p4 = new Producto("Sabritas", 30);
		Empleado e1 = new Empleado("Gerente", "Karina", 8000);
		Empleado e2 = new Empleado("Empleado", "Jorge", 4000);
		Empleado e3 = new Empleado("Empleado", "Poli", 4000);
		Empleado e4 = new Empleado("Empleado", "Octavio", 4000);

		this.direccion = direccion;
		this.dinero = dinero;
		this.contadorProducto = contadorProducto;
		this.contadorEmpleado = contadorEmpleado;
		contadorTienda++;
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public String getDireccion()
	{
		return direccion;
	}

	
	public void setDinero(int dinero)
	{
		this.dinero = dinero;
	}

	public int getDinero()
	{
		return dinero;
	}

	public int getContadorProducto()
	{
		return contadorProducto;
	}
	
	public int getContadorEmpleado()
	{
		return contadorEmpleado;
	}

	public static int getContadorTienda()
	{
		return contadorTienda;
	}
	
}

