package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Detalle pedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "subtotal")
    private double subtotal;

    @ManyToOne(cascade = CascadeType.ALL)
    private Pedido pedido;
    @ManyToOne(cascade = CascadeType.ALL)
    private ArticuloManufacturado artManufacturado;
    @ManyToOne(cascade = CascadeType.ALL)
    private ArticuloInsumo articuloInsumo;
}
