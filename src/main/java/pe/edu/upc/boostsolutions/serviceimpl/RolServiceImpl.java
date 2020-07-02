package pe.edu.upc.boostsolutions.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.boostsolutions.model.Rol;
import pe.edu.upc.boostsolutions.repository.IRolDAO;
import pe.edu.upc.boostsolutions.service.IRolService;

import java.util.List;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolDAO data;

    @Override
    public List<Rol> Mostrar() {
        return data.findAllByOrderByRolAsc();
    }
}
