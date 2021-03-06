package pe.edu.upc.boostsolutions.service;

import pe.edu.upc.boostsolutions.model.Marca;

import java.util.List;
import java.util.Optional;

public interface IMarcaService {

    public List<Marca> Mostrar();
    public Optional<Marca> BuscarId(Long id);
    public List<Marca> BuscarNombre(String textobuscar);
    public Long Guardar(Marca marca);
    public void Eliminar(Long id);
    public Marca ValidarNombre(String nombreMarca);
    //Para Producto
    //public List<Marca> VistaMarca_Producto();
    //public List<Marca> BuscarVistaMarca_Producto(String textobuscar);
}
