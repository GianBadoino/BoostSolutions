package pe.edu.upc.boostsolutions.service;

import pe.edu.upc.boostsolutions.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> Mostrar();
    public Optional<Producto> BuscarId(Long id);
    public List<Producto> BuscarNombre(String textobuscar);
    public Long Guardar(Producto producto);
    public void Eliminar(Long id);
    public Producto ValidarNombre(String nombreProducto);
}
