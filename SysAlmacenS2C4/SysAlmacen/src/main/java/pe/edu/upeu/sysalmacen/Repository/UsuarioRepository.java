package pe.edu.upeu.sysalmacen.Repository;



import pe.edu.upeu.sysalmacen.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
