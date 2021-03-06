package pe.edu.upc.boostsolutions.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.boostsolutions.model.Proveedor;
import pe.edu.upc.boostsolutions.repository.IProveedorDAO;
import pe.edu.upc.boostsolutions.service.IProveedorService;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private IProveedorDAO data;

    @Override
    public List<Proveedor> Mostrar() {
        return data.findAllByOrderByNombreProveedorAsc();
    }

    @Override
    public Optional<Proveedor> BuscarId(Long id) {
        return data.findById(id);
    }

    @Override
    public List<Proveedor> BuscarNombre(String textobuscar) {
        return data.findByNombreProveedorContainingIgnoreCaseOrderByNombreProveedorAsc(textobuscar);
    }

    @Override
    public Long Guardar(Proveedor proveedor) {
        long rpta = 0;
        Proveedor p = data.save(proveedor);

        if (!p.equals(null))
        {
            rpta = 1;
        }

        return  rpta;
    }

    @Override
    public void Eliminar(Long id) {
        data.deleteById(id);
    }

    @Override
    public Proveedor ValidarNombre(String nombreProveedor) {
        return data.findByNombreProveedor(nombreProveedor);
    }
}
