package app.curso.banco.main;
import java.util.HashMap;
import app.curso.banco.entidad.Cliente;

public class TestCuentas {
	
	public static void main(String[] args) {
	
	Cliente cliente = new Cliente (1,"Anna Martinez ", " 623 789 123 ", 0);
	
	cliente.abrirCuenta ("ES123" , 789F);
	
	cliente.abrirCuenta ("ES678", 30f);
	
    cliente.mostrarInfo();
    
    cliente.retirarDinero("ES123", 20f);
    
    cliente.mostrarInfo();
    
    cliente.ingresarDinero("ES678", 200f);
    
    cliente.mostrarInfo();
    
    cliente.cerrarCuenta("ES123");
    
    cliente.mostrarInfo();

	}
}
