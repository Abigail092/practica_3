package app.curso.banco.main;

public class Aleatorio {
	
	public satic void main(String[] args) {
		
		Random random = new Random();
		
		String [] nombre = ("Juan", );
		//igual pero con apellidos
		
		
		for( int i=0; i<=10; i++) {
			
		int indexNombre = random.nextInt(nombres.length);
		String nombreAleatorio = nombres[indexNombre];
		
		int indexApellido = random.nextInt(apellidos.length);
		String apellidoAleatorio = apellido[indexApellido];
		
		String nombreCompleto = nombreAleatorio + "  " + apellidoAleatorio;
	}

}
