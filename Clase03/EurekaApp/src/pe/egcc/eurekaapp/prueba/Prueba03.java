package pe.egcc.eurekaapp.prueba;

import java.util.List;
import pe.egcc.eurekaapp.model.Cliente;
import pe.egcc.eurekaapp.service.ClienteService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronec@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    
    try {
      
      Cliente bean = new Cliente();
      bean.setCodigo("00003");
      bean.setPaterno("");
      bean.setMaterno("");
      bean.setNombre("");
      
      ClienteService service = new ClienteService();
      
      List<Cliente> lista = service.traerClientes(bean);
      
      for (Cliente c : lista) {
        System.out.println(c.toString());
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
