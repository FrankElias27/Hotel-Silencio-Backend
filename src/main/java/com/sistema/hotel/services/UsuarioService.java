package com.sistema.hotel.services;

import com.sistema.hotel.entity.Usuario;
import com.sistema.hotel.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
}
