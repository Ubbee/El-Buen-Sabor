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
@Table(name = "configuracion")
public class Configuracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cantidadCocineros")
    private int cantidadCocineros;
    @Column(name = "emailEmpresa")
    private String emailEmpresa;
    @Column(name = "tokenMercadoPago")
    private String tokenMercadoPago;

}
