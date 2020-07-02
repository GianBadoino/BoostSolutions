package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.Categoria;

import java.util.List;

@Repository
public interface ICategoriaDAO extends CrudRepository<Categoria, Long> {
    List<Categoria> findAllByOrderByNombreCategoriaAsc();
    List<Categoria> findByNombreCategoriaContainingIgnoreCaseOrderByNombreCategoriaAsc(String nombreCategoria);
    Categoria findByNombreCategoria(String nombreCategoria);

    //Para Modulo Producto
    //List<Categoria> findTop7ByOrderByNombreCategoriaAsc();
    //List<Categoria> findTop7ByNombreCategoriaContainingIgnoreCaseOrderByNombreCategoriaAsc(String nombreCategoria);
}
