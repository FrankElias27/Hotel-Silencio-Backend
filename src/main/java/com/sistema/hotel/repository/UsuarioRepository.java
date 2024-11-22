package com.sistema.hotel.repository;

import com.sistema.hotel.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public  Usuario findByUsername(String username);
}
