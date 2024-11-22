package com.sistema.hotel.controllers;

import com.sistema.hotel.entity.Rol;
import com.sistema.hotel.entity.Usuario;
import com.sistema.hotel.entity.UsuarioRol;
import com.sistema.hotel.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws  Exception{
        Set<UsuarioRol> roles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("USUARIO");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return usuarioService.guardarUsuario(usuario,roles);

    }

    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable ("username") String username) {
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable ("usuarioId") Long usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }
}
