package org.example;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "DetalleFactura")
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int cantidad;
    private int subtotal;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "factura_id") // Clave foránea a Factura
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "articulo_id") //Clave foranea a Articulo
    private Articulo articulo;
}
