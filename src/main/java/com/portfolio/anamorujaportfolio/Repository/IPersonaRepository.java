
package com.portfolio.anamorujaportfolio.Repository;

import com.portfolio.anamorujaportfolio.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
    
}
