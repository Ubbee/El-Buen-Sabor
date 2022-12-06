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
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private long telefono;
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "cliente")
    private Usuario usuario;
    @OneToOne(mappedBy = "cliente")
    private Domicilio domicilio;

    @OneToMany(mappedBy = "pedidos")
    private List<Pedido> pedidos = new ArrayList<Pedido>();

}
