package co.edu.univalle.producto_service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String nombre;
    private Double precio;

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
