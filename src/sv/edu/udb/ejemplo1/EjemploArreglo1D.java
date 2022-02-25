package sv.edu.udb.ejemplo1;
import javax.swing.*;

public class EjemploArreglo1D {
	public static void main(String[] args) {
		//Dos arreglos de 1 dimensión
		String Estudiantes[] = new String[8];
		int Edades[] = new int[8];
		
		//Variables de proces
		double promedio=0;
		String mensaje="";
		
		//Variable bandera
		int i=0;
		
		//while(i<8) {
		//	Estudiantes[i] =
		//			JOptionPane.showInputDialog(null,
		//		    "Ingrese el nombre del estudiante numero "+(i+1));
		//	//Esto es igual a i = i + 1
		//	i++;
		//}
		
		//Ciclo para solicitar la informacion
		for(i=0;i<Edades.length;i++) {
			Estudiantes[i] =
					JOptionPane.showInputDialog(null,
				    "Ingrese el nombre del estudiante numero "+(i+1));
			Edades[i] = Integer.parseInt(
					JOptionPane.showInputDialog(null,
				    "Ingrese la edad de "+Estudiantes[i]));
		}
		
		//Ciclo para obtener el promedio de edades
		for(i=0;i<Edades.length;i++) {
			promedio = promedio + Edades[i];
		}
		
		promedio = promedio/Edades.length;
		
		//Forma de obtener promedio poco optimo
		//promedio = (Edades[0] + Edades[1]+ Edades[2]+ Edades[3]
		//		+ Edades[4]+ Edades[5]+ Edades[6]+ Edades[7])/Edades.length;
		
		//Variable para manejar mensajes
		mensaje = "La lista de alumnos es:\n";
		
		for(i=0;i<Estudiantes.length;i++) {
			mensaje = mensaje+ (i+1) +". "+ Estudiantes[i]
					+" y su edad es: "+ Edades[i]+"\n";
		}
		
		mensaje = mensaje + "Y el promedio de edades es: "+promedio;
		
		//Enviamos el mensaje acumulado
		JOptionPane.showMessageDialog(null, mensaje);
		
//		JOptionPane.showMessageDialog(null, 
//				"La lista de alumnos es:\n"
//			  + "1. "+ Estudiantes[0]+" y su edad es: "+ Edades[0]+"\n"
//			  + "2. "+ Estudiantes[1]+" y su edad es: "+ Edades[1]+"\n"
//			  + "3. "+ Estudiantes[2]+" y su edad es: "+ Edades[2]+"\n"
//			  + "4. "+ Estudiantes[3]+" y su edad es: "+ Edades[3]+"\n"
//			  + "5. "+ Estudiantes[4]+" y su edad es: "+ Edades[4]+"\n"
//			  + "6. "+ Estudiantes[5]+" y su edad es: "+ Edades[5]+"\n"
//			  + "7. "+ Estudiantes[6]+" y su edad es: "+ Edades[6]+"\n"
//			  + "8. "+ Estudiantes[7]+" y su edad es: "+ Edades[7]+"\n"
//			  		 + "Y el promedio de edades es: "+promedio);
		

	}
}
