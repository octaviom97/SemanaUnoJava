public class Main{
	public static void main(String[] args)
	{
		Tienda sucursal1 = new Tienda("Sucursal", 60000);
		
		
		System.out.println("\nLos datos de la sucursal son: \n");
		System.out.println("Direccion: ");
		System.out.println(sucursal1.getDireccion());
		System.out.println("Cantidad de dinero en la sucursal: ");
		System.out.println(sucursal1.getDinero());
		System.out.println("Cantidad de productos en la sucursal: ");
		System.out.println(sucursal1.getContadorProducto());
		System.out.println("Cantidad de empleados en la sucursal: ");
		System.out.println(sucursal1.getContadorEmpleado());
		System.out.println();
		System.out.println("\n");
		
	}

}