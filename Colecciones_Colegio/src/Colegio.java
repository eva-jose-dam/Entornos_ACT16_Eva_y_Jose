import java.util.HashMap;

/* Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. La clase tendr� los siguientes m�todos.
 * 
o	addAlumno(String nacionalidad)
a�ade la nacionalidad de un nuevo alumno

o	showAll()
Muestra las distintas nacionalidades y el n�mero de alumnos que existen por nacionalidad.

o	pista:
for(String key: nacionalidades.keySet())
System.out.println(key + � � � + nacionalidades.get(key));

o	showNacionalidad(String nacionalidad)
Muestra la nacionalidad y el n�mero de alumnos de esa nacionalidad

o	cuantos()
Muestra cu�ntas nacionalidades diferentes existen en el colegio.

o	borra()
Elimina los datos insertados.

 */
public class Colegio {
	private HashMap<String,Integer> alumno = new HashMap<String,Integer>(); //HashMap es una colecci�n de objetos como los arrays pero sin orden. Ignora los repetidos
	 

	// metodo - a�ade la nacionalidad de un nuevo alumno
		public void addAlumno(String nac)
		{
			if (alumno.containsKey(nac))  //Comprueba si est� la clave especificada. 7.3 pag 16

			{
				int i = alumno.get(nac);  //Da el valor asociado a una clave o null si no se encontr�.
				alumno.remove(nac);   //Elimina el par clave-valor que corresponde a la clave.
				i++;
				alumno.put(nac, i);  //a�ade un nuevo par clave-valor al dicionario
			}
			else
			{
				alumno.put(nac,1);  //a�ade un nuevo par clave-valor al dicionario
			}
		}	

	}

}
