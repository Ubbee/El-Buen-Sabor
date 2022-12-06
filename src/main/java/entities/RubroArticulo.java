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
@Table(name = "Rubro Articulo")
public class RubroArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "rubroArticulo")
    private List<RubroArticulo> ordenesCliente = new ArrayList<RubroArticulo>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_rubroArticulo")
    private RubroArticulo rubroArticulo;

    @OneToMany(mappedBy = "rubroArticulo")
    private List<ArticuloInsumo> articuloInsumos = new ArrayList<ArticuloInsumo>();
}
