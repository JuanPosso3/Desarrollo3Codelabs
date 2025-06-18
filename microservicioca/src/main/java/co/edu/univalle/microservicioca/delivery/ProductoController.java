package co.edu.univalle.microservicioca.delivery;


import co.edu.univalle.microservicioca.application.usecase.ListarProductosUseCase;
import co.edu.univalle.microservicioca.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ListarProductosUseCase listarProductosUseCase;

    public ProductoController(ListarProductosUseCase listarProductosUseCase) {
        this.listarProductosUseCase = listarProductosUseCase;
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return listarProductosUseCase.ejecutar();
    }
}