
package com.portfolio.anamorujaportfolio.Security.Repository;

import com.portfolio.anamorujaportfolio.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNameUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String nombreEmail);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
}
