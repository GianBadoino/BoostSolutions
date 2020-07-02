package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.Marca;

import java.util.List;

@Repository
public interface IMarcaDAO extends CrudRepository<Marca, Long> {
    List<Marca> findAllByOrderByNombreMarcaAsc();
    List<Marca> findByNombreMarcaContainingIgnoreCaseOrderByNombreMarcaAsc(String nombreMarca);
    Marca findByNombreMarca(String nombreMarca);
    //Para Modulo Producto
    //List<Marca> findTop7ByOrderByNombreMarcaAsc();
    //List<Marca> findTop7ByNombreMarcaContainingIgnoreCaseOrderByNombreMarcaAsc(String nombreMarca);
}
