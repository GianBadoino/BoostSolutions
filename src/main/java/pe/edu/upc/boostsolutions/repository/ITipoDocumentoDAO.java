package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.TipoDocumento;

@Repository
public interface ITipoDocumentoDAO extends CrudRepository<TipoDocumento,Integer> {
}
