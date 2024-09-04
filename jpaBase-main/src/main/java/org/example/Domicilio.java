package org.example;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name = "Domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombrecalle;
    private int numero;

    @OneToOne
    @JoinColumn(name = "cliente_id") // Clave foránea a Cliente
    @ToString.Exclude
    private Cliente cliente;


}
