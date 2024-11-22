package com.sistema.hotel.repository;

import com.sistema.hotel.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
