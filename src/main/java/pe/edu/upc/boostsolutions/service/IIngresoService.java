package pe.edu.upc.boostsolutions.service;

import pe.edu.upc.boostsolutions.model.Ingreso;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IIngresoService {
    public List<Ingreso> Mostrar();

    public Long Guardar(Ingreso ingreso);

    public void Eliminar(Long id);

    public List<Ingreso> BuscarEntreFechas(LocalDate fechainicio, LocalDate fechafin);
}
