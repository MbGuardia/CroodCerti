package cal;

public class producto {

	public producto() {

	}

	int ID;
	String descripcion;
	double precio;
	int cantidad;
	String proveedor;

	public producto(int iD, String descripcion, double precio, int cantidad, String proveedor) {
		super();
		ID = iD;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

}
