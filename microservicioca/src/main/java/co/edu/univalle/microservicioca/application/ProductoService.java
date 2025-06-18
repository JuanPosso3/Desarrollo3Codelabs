package co.edu.univalle.microservicioca.application;

import co.edu.univalle.microservicioca.domain.model.Producto;
import co.edu.univalle.microservicioca.domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}