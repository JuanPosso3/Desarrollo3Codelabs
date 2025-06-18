package co.edu.univalle.microservicioca.domain.repository;

import co.edu.univalle.microservicioca.domain.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);
    List<Producto> findAll();
}