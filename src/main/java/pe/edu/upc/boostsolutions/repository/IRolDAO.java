package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.Rol;

import java.util.List;

@Repository
public interface IRolDAO extends CrudRepository<Rol,Long> {
    List<Rol> findAllByOrderByRolAsc();
}
