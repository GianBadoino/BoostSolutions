package pe.edu.upc.boostsolutions.service;

import pe.edu.upc.boostsolutions.model.Proveedor;

import java.util.List;
import java.util.Optional;

public interface IProveedorService {
    public List<Proveedor> Mostrar();
    public Optional<Proveedor> BuscarId(Long id);
    public List<Proveedor> BuscarNombre(String textobuscar);
    public Long Guardar(Proveedor proveedor);
    public void Eliminar(Long id);
    public Proveedor ValidarNombre(String nombreProveedor);
}
