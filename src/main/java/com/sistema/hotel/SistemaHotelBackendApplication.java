package com.sistema.hotel;

import com.sistema.hotel.entity.Rol;
import com.sistema.hotel.entity.Usuario;
import com.sistema.hotel.entity.UsuarioRol;
import com.sistema.hotel.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaHotelBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaHotelBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setNombre("Administrador");
		usuario.setApellido("Sistema");
		usuario.setUsername("Admin");
		usuario.setPassword("1234");
		usuario.setEmail("usuario@email.com");
		usuario.setTelefono("123456789");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());

	}
}
