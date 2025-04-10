package pe.edu.upeu.sysalmacen.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.Model.Marca;

@RequestMapping("/marcas")
@RestController
public class MarcaController {
    @GetMapping
    public Marca mostrarMarca(){
        return Marca.builder().idMarca(0L).nombre("Adidas").build();
    }
}
