package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.TipoComprobante;

@Repository
public interface ITipoComprobanteDAO extends CrudRepository<TipoComprobante,Integer> {
}
