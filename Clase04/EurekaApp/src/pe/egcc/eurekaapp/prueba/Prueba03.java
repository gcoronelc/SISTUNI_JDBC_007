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
      // Dato
      String codigo = "00005";
      // Proceso
      ClienteService service = new ClienteService();
      Cliente bean = service.traerCliente(codigo);
      // Reporte
      System.out.println("Codigo: " + bean.getCodigo());
      System.out.println("Paterno: " + bean.getPaterno());
      System.out.println("Materno: " + bean.getMaterno());
      System.out.println("Nombre: " + bean.getNombre());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
