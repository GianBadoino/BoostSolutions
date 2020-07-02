package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.boostsolutions.model.Categoria;
import pe.edu.upc.boostsolutions.model.Proveedor;

import java.util.List;

public interface IProveedorDAO extends CrudRepository<Proveedor,Long> {
    List<Proveedor> findAllByOrderByNombreProveedorAsc();
    List<Proveedor> findByNombreProveedorContainingIgnoreCaseOrderByNombreProveedorAsc(String nombreProveedor);
    Proveedor findByNombreProveedor(String nombreProveedor);
}