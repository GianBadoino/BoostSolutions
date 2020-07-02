package pe.edu.upc.boostsolutions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.boostsolutions.model.Ingreso;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IIngresoDAO extends CrudRepository<Ingreso,Long> {
    List<Ingreso> findAllByOrderByIdIngresoAsc();
    List<Ingreso> findByFechaIngresoBetween(LocalDate fechainicio, LocalDate fechafin);
}
