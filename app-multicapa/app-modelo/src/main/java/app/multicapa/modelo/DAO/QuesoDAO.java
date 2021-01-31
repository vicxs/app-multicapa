package app.multicapa.modelo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.multicapa.modelo.entidades.Queso;

@Repository
public interface QuesoDAO extends JpaRepository<Queso, Integer> {

}
