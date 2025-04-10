package pe.edu.upeu.sysalmacen.Model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "upeu_acceso_rol")
@IdClass(AccesoRolPK.class)
public class AccesoRol {
    @Id
    private Rol rol;
    @Id
    private Acceso acceso;
}
