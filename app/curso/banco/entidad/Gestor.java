package app.curso.banco.entidad;

public class Gestor extends Persona {

	
	private int idOficina;
	
	public Gestor() {
		
	}


	public Gestor (int id, String nombre, String telefono, int idOficina ) {
		super(id, nombre, telefono);
		this.idOficina = idOficina ;

	}

	public int idOficina() {
		return this.idOficina;
	}

	public void idOficina(int idOficina) {
		this.idOficina = 

			private int idOficina;

			public Gestor () {

			}

			public Gestor(int id, String nombre, String telefono, int idOficina) {
				super(id, nombre, telefono);
				this.idOficina = idOficina;

			}

			public int idOficina () {
				return this.idOficina;
			}

			public void idOficina(int idOficina) {
				this.idOficina = idOficina;
			}

			public void mostrarInfo() {
				super.mostrarInfo();
				System.out.println("idOficina: " + this.idOficina + " €");
			}

			// ingresar dinero

			public int idOficina(int dinero) {
				// el return es lo que queda en la cuenta
				this.totalDinero += dinero;
				return this.totalDinero;
			}

			// retirar dinero

			public float retirarDinero(float dinero) {
				if (this.totalDinero - dinero >= 0) {
					this.totalDinero -= dinero;
				}
				return this.totalDinero;
			}
		}totalDinero;
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

	// retirar dinero

	public float retirarDinero(float dinero) {
		if (this.totalDinero - dinero >= 0) {
			this.totalDinero -= dinero;
		}
		return this.totalDinero;
	}
}