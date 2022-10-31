package com.portfolio.anamorujaportfolio.Security.Repository;


import com.portfolio.anamorujaportfolio.Security.Entity.Rol;
import com.portfolio.anamorujaportfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombr(RolNombre rolNombre);

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
