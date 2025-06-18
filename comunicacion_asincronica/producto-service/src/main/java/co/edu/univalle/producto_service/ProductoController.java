package co.edu.univalle.producto_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductorService productorService;

    public ProductoController(ProductorService productorService) {
        this.productorService = productorService;
    }

    @PostMapping("/enviar")
    public String enviarProductos(@RequestBody List<ProductDTO> productos) {
        productorService.enviarListaProductos(productos);
        return "Productos enviados con éxito al pedido-service";
    }
}
