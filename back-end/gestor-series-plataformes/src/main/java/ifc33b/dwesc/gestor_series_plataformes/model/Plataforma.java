package ifc33b.dwesc.gestor_series_plataformes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "plataforma")
public class Plataforma {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Se requiere un nombre para la plataforma")
    private String nom;

    // Constructores
    public Plataforma() {}

    public Plataforma(String nom) {
        this.setNom(nom);
    }
}
