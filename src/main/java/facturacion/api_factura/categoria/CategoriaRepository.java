package facturacion.api_factura.categoria;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

    List<Categoria> findAll();
}