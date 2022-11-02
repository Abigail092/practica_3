package app.curso.banco.main;

importar  Java . útil _ aleatorio ;

aplicación de importación . cursor _ banco _ útil _ Utiles ;

clase  pública TestRandom {

	public  static  void  main ( String [] args ) {

		// no olvidarse de importar Random más arriba
		Aleatorio  aleatorio = nuevo  Aleatorio ();

		// lista de cadenas con valores
		String [] nombres = { "Juan" , "Pedro" , "Antonia" , "Paco" , "Irene" };

		String [] apellidos = { "Pérez" , "Martín" , "López" , "Gómez" , "Uta" , "Lama" };

		//int indexNombre = random.nextInt(nombres.longitud);
		//String nombreAleatorio = nombres[indexNombre];

		//int indexApellido = random.nextInt(apellidos.length);
		//String apellidoAleatorio = apellidos[indexApellido];

		para ( int  i = 0 ; i < 10 ; i ++) {
			String  nombreAleatorio = Utiles . nombreAleatorio ( Utiles . NOMBRES , apellidos );
			sistema _ fuera _ println ( nombreAleatorio );
		}

//System.out.println("Nombre completo aleatorio: " + nombreCompleto);

//int enteroAleatorio = random.nextInt(100);
//doble decimalAleatorio = random.nextDouble(100);
//booleano booleanoAleatorio = random.nextBoolean();
//System.out.println("Entero aleatorio: " + enteroAleatorio);
//System.out.println("Doble aleatorio: " + decimalAleatorio);
//System.out.println("Booleano aleatorio: " + booleanoAleatorio);
//System.out.println("Índice: " + índice);
//System.out.println("Nombre aleatorio: " + nombreAleatorio);
	}
}
