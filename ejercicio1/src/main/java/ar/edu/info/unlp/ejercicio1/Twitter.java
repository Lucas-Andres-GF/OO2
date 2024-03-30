package ar.edu.info.unlp.ejercicio1;

//Ejercicio 1: Red social 
//Se quiere programar en objetos una versión simplificada de una red social parecida a Twitter. 
//Este servicio debe permitir a los usuarios registrados postear y leer mensajes de hasta 280 caracteres.
//Ud. debe modelar e implementar parte del sistema donde nos interesa que quede claro lo siguiente: 
//● Cadausuario conoce todos los Tweets que hizo.
//● Untweetpuede ser re-tweet de otro, y este tweet debe conocer a su tweet de origen. 
//● Twitter debe conocer a todos los usuarios del sistema. 
//● Los tweets de un usuario se deben eliminar cuando el usuario es eliminado. No existen tweets no referenciados por un usuario. 
//● Losusuarios se identifican por su screenName. ● Nosepuedenagregar dos usuarios con el mismo screenName. 
//● Los tweets deben tener un texto de 1 carácter como mínimo y 280 caracteres como máximo. 
//● Unre-tweet no tiene texto adicional.
//
//Tareas: 
//Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita. Se espera que entregue los siguientes productos. 
//1. Diagrama de clases UML. 
//2. Implementación en Java de la funcionalidad requerida. 
//3. Implementar los tests (JUnit) que considere necesarios. 
//Nota: para crear el proyecto Java, lea el material llamado “Trabajando en OO2 con proyectos Maven”.

import java.util.ArrayList;

import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;

	public Twitter() {
		usuarios = new ArrayList<Usuario>(); 
	}
	
	
	public boolean existeUsuario(String screenName){
		return usuarios.stream().anyMatch(usuario ->usuario.getScreenName().equals(screenName));
	}
	
	public Usuario agregarUsuario(String screenName) {
		if (existeUsuario(screenName.toLowerCase())) {
			return null; 
		}
		Usuario usuario = new Usuario(screenName.toLowerCase()); 
		usuarios.add(usuario); 
		return usuario; 
	}
	
	public boolean eliminarUsuario(Usuario usuario) {
		if (!existeUsuario(usuario.getScreenName()))
			return false; 
		usuario.eliminarPublicaciones();
		return true; 
	}
	
	public String verPublicaciones(Usuario usuario) {
		return usuario.verPublicaciones(); 
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios; 
	}
}
