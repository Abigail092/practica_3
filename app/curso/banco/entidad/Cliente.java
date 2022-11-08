package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona {

	private float totalDinero;
	// Cada cuenta tiene una clave de tipo String
	// y una cantidad de dinero Float
	
    private HashMap<String, Float> cuentas;
    
	public Cliente() {

	}

	public Cliente(int id, String nombre, String telefono, float totalDinero) {
		super(id, nombre, telefono);
		this.totalDinero = totalDinero;
		this.cuentas=new HashMap<>();
	}

	public float getTotalDinero() {
		return this.totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Total dinero: " + this.totalDinero + " €");
	}

	// ingresar dinero

	public float ingresarDinero(float dinero) {
		// el return es lo que queda en la cuenta
		this.totalDinero += dinero;
		return this.totalDinero;
	}


	
	public void abrirCuenta(String idCuenta, Float dinero){
		this.cuentas.put(idCuenta, dinero);
		ingresarDinero(dinero);
		System.out.println("Abierta la cuenta" + idCuenta);
	}
	
	
	public float retirarDinero(float dinero) {
		if (this.totalDinero - dinero >= 0) {
			this.totalDinero -= dinero;
		}
		return this.totalDinero;
	}
	
	
	// Cerrar Cuenta
	
	public float ingresarDinero(String idCuenta, Float dinero) {
		if (this.cuentas.get(idCuenta) != null) {
			this.cuentas.put(idCuenta, dinero);
			ingresarDinero(dinero);
			
		}else
			System.out.println("La cuenta no existe");
		
		return this.totalDinero;
	}
	
	public float retirarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (dineroEnCuenta != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
			retirarDinero(dinero);
			System.out.println("Se ha retirado " + dinero + " € de " + idCuenta);
		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;
	}
	
	public void cerrarCuenta(String idCuenta){
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		if (dineroEnCuenta != 0) {
		retirarDinero(idCuenta, dineroEnCuenta);
		this.cuentas.remove(idCuenta);
		}else {
			System.out.println("La cuenta no se puede borrar porque aún hay dinero");
		}
	}
	
	public void mostrarCuentas() {
		this.cuentas.forEach((idCuenta, dinero) -> {
			System.out.println("> " + idCuenta + ": " + dinero + " €");
		});
	
	}
}
