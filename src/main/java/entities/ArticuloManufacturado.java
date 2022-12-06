package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Articulo manufacturado")
public class ArticuloManufacturado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tiempoEstimadoCocina")
    private int tiempoEstimadoCocina;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioVenta")
    private double precioVenta;
    @Column(name = "imagen")
    private String imagen;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_rubroGeneral")
    private RubroGeneral rubroGeneral;

    @OneToMany(mappedBy = "detallesPedido")
    private List<DetallePedido> detallesPedido = new ArrayList<DetallePedido>();
    @OneToMany(mappedBy = "detallesFactura")
    private List<DetalleFactura> detallesFactura = new ArrayList<DetalleFactura>();
    @OneToMany(mappedBy = "detallesFactura")
    private List<ArticuloManufacturadoDetalle> artManufacturadoDetalles;

    public ArticuloManufacturado() {
        artManufacturadoDetalles = new ArrayList<ArticuloManufacturadoDetalle>();
    }
}
