package co.edu.univalle.microservicioca.application.usecase;


import co.edu.univalle.microservicioca.domain.model.Producto;
import co.edu.univalle.microservicioca.domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.findAll();
    }
}
