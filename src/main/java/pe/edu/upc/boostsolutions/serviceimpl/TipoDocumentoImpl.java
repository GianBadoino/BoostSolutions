package pe.edu.upc.boostsolutions.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.boostsolutions.model.TipoDocumento;
import pe.edu.upc.boostsolutions.repository.ITipoDocumentoDAO;
import pe.edu.upc.boostsolutions.service.ITipoDocumentoService;

import java.util.List;

@Service
public class TipoDocumentoImpl implements ITipoDocumentoService {

    @Autowired
    private ITipoDocumentoDAO data;

    @Override
    public List<TipoDocumento> Mostrar() {
        return (List<TipoDocumento>) data.findAll();
    }
}
