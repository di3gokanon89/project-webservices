/**
 * 
 */
package com.devpredator.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectwebservices.entity.Empleado;

/**
 * @author DevPredator
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar un empleado por su id.
	 * @param numeroEmpleado {@link String} numero del empleado.
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEmpledoPorNumeroEmpleado(String numeroEmpleado) {
		
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}	
		}
		
		return null;
	}
	/**
	 * Metodo que simula la consulta de un empleado.
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleado() {
		
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);
		
		return empleado;
	}
	/**
	 * Metodo que permite consultar la lista de empleados.
	 * @return {@link List} lista consultada.
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList();
		
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Diego");
		empleado.setPrimerApellido("Paniagua");
		empleado.setSegundoApellido("López");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);
		
		Empleado empleadoNuevo = new Empleado();
		empleadoNuevo.setNumeroEmpleado("7864674");
		empleadoNuevo.setNombre("Erick");
		empleadoNuevo.setPrimerApellido("Guerrero");
		empleadoNuevo.setSegundoApellido("Gómez");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(31);
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		
		return empleados;
	}
}
