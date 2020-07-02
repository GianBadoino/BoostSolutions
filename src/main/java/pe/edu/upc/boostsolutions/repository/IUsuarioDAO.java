package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.Usuario;

import java.util.List;

@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario,Long> {
    List<Usuario> findAllByOrderByNombreUsuarioAsc();
    List<Usuario> findByNombreUsuarioContainingIgnoreCaseOrderByNombreUsuarioAsc(String username);
    Usuario findByUsername(String username);
}
