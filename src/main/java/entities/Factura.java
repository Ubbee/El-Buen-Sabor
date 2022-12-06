package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "numero")
    private int numero;
    @Column(name = "montoDescuento")
    private double montoDescuento;
    @Column(name = "formaPago")
    private String formaPago;
    @Column(name = "nroTarjeta")
    private String nroTarjeta;
    @Column(name = "totalVenta")
    private double totalVenta;
    @Column(name = "totalCosto")
    private double totalCosto;


    @OneToOne(mappedBy = "factura")
    private Pedido pedido;
    @ManyToOne(cascade = CascadeType.ALL)
    private List<DetalleFactura> detallesFactura;

    public Factura() {
        detallesFactura = new ArrayList<DetalleFactura>();
    }
}
