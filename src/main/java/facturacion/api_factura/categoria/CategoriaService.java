package facturacion.api_factura.categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired CategoriaRepository categoriaRepository;

public Categoria save(Categoria entity){
    return categoriaRepository.save(entity);
}

public Categoria findById( Long id){
    return categoriaRepository.findById(id).orElse(new Categoria());
}

public void deleteById(Long id){
    categoriaRepository.deleteById(id);
}

public List<Categoria> findAll(){
    return categoriaRepository.findAll();
}
}
