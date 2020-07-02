package pe.edu.upc.boostsolutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.boostsolutions.model.Categoria;
import pe.edu.upc.boostsolutions.model.Ingreso;
import pe.edu.upc.boostsolutions.service.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping
public class IngresoController
{
    @Autowired
    private IIngresoService ingresoservice;

    @Autowired
    private ITipoComprobanteService tipocomprobanteservice;

    @Autowired
    private IProductoService productoservice;

    @Autowired
    private IProveedorService proveedorservice;

    @GetMapping("/ingresos")
    String Mostrar(Model model) {
        List<Ingreso> ingresos = ingresoservice.Mostrar();
        model.addAttribute("ingresos", ingresos);
        return "ingreso";
    }

    @GetMapping("/ingresos/nuevo")
    public String GuardarMethod(Model model) {
        model.addAttribute("ingreso", new Ingreso());
        model.addAttribute("listaproductos", productoservice.Mostrar());
        model.addAttribute("listatipocomprobante", tipocomprobanteservice.Mostrar());
        model.addAttribute("listaproveedores", proveedorservice.Mostrar());
        return "newingreso";
    }

    @PostMapping("/ingresos/guardar")
    public String Guardar(@Valid Ingreso i, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listaproductos", productoservice.Mostrar());
            model.addAttribute("listatipocomprobante", tipocomprobanteservice.Mostrar());
            model.addAttribute("listaproveedores", proveedorservice.Mostrar());

            return "newingreso";
        }
        ingresoservice.Guardar(i);
        return "redirect:/ingresos";
    }

    @GetMapping("/ingresos/eliminar/{id}")
    public String Eliminar(@PathVariable Long id) {
        ingresoservice.Eliminar(id);
        return "redirect:/ingresos";
    }

    @GetMapping("/ingresos/buscar")
    public String Buscar(Model model, @RequestParam("fechainicio") LocalDate fechainicio, @RequestParam("fechafin") LocalDate fechafin) {
        List<Ingreso> ingresos = ingresoservice.BuscarEntreFechas(fechainicio,fechafin);
        model.addAttribute("ingresos", ingresos);

        return "ingreso";
    }
}
