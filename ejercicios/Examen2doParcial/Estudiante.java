public class Estudiante {
	
	private String noEstudiante;
	private String nombre;
	private Fecha fecha;
	private int puntuacion;
	private int noDeEstudiantes;

	public Estudiante () {
		this.noDeEstudiantes=getNoDeEstudiantes();
		this.noEstudiante="No conocido";
		this.nombre="No conocido";
		this.puntuacion=20;
		this.fecha=new Fecha("01/01/1995");
	}

	public Estudiante (String noEstudiante_param, String nombre_param, String fecha_param, int puntacion_param){
		this.noDeEstudiantes=getNoDeEstudiantes();
		this.noEstudiante=noEstudiante_param;
		this.nombre=nombre_param;
		this.puntuacion=puntacion_param;
		this.fecha= new Fecha(fecha_param);
	}

	public int getNoDeEstudiantes(){
		this.noDeEstudiantes+=1;	
		return this.noDeEstudiantes;
	}

 	public String toString(){
 		return this.noDeEstudiantes + " " + this.noEstudiante + " " + this.nombre + " " + this.fecha + " "+ this.puntuacion; 
 	}


}