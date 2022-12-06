package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Articulo insumo")
public class ArticuloInsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioCompra")
    private double precioCompra;
    @Column(name = "precioVenta")
    private double precioVenta;
    @Column(name = "stockActual")
    private double stockActual;
    @Column(name = "stockMinimo")
    private double stockMinimo;
    @Column(name = "unidadMedida")
    private String unidadMedida;
    @Column(name = "esInsumo")
    private boolean esInsumo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_rubroArticulo")
    private RubroArticulo rubroArticulo;

    @OneToMany(mappedBy = "detallesPedido")
    private List<DetallePedido> detallesPedido = new ArrayList<DetallePedido>();
    @OneToMany(mappedBy = "detallesFactura")
    private List<DetalleFactura> detallesFactura = new ArrayList<DetalleFactura>();
    @OneToMany(mappedBy = "ArticulosManufacturadosDetalle")
    private List<ArticuloManufacturadoDetalle> artManufacturadosDetalle = new ArrayList<ArticuloManufacturadoDetalle>();
}
