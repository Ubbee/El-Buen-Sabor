package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "MercadoPago datos")
public class MercadoPagoDatos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "identificadorPago")
    private long identificadorPago;
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    @Column(name = "fechaAprobacion")
    private Date fechaAprobacion;
    @Column(name = "formaPago")
    private String formaPago;
    @Column(name = "metodoPago")
    private String metodoPago;
    @Column(name = "nroTarjeta")
    private String nroTarjeta;
    @Column(name = "estado")
    private String estado;

    @OneToOne(mappedBy = "mercadoPagoDatos")
    private Pedido pedido;
}
