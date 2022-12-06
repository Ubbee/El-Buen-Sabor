package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fecha")
    private int fecha;
    @Column(name = "numero")
    private int numero;
    @Column(name = "estado")
    private int estado;
    @Column(name = "horaEstimadaFin")
    private Date horaEstimadaFin;
    @Column(name = "tipoEnvio")
    private int tipoEnvio;
    @Column(name = "total")
    private double total;

    @OneToOne(mappedBy = "pedido")
    private MercadoPagoDatos mercadoPagoDatos;
    @OneToOne(mappedBy = "pedido")
    private Factura factura;
    @OneToOne(mappedBy = "pedido")
    private Domicilio domicilio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    @JoinColumn(name = "fk_detallePedidos")
    private List<DetallePedido> detallePedidos;

    public Pedido() {
        detallePedidos = new ArrayList<DetallePedido>();
    }
}
