package pe.egcc.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.model.Cliente;


public class ClienteService 
  implements RowMapper<Cliente>{
  
  private final String SQL_SELECT 
          = "select chr_cliecodigo, vch_cliepaterno, "
          + "vch_cliematerno, vch_clienombre, "
          + "chr_cliedni, vch_clieciudad, "
          + "vch_cliedireccion, vch_clietelefono, "
          + "vch_clieemail from cliente ";
   private final String SQL_INSERT = "";
   private final String SQL_UPDATE = "";
   private final String SQL_DELETE = "";

  public void crear(Cliente bean){
    
  }
  
  public void modificar(Cliente bean){
    
  }
  
  public void eliminar(String codigo){
    
  }
  
  public Cliente traerCliente(String codigo){
    Cliente bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT + " where chr_cliecodigo = ?";
      PreparedStatement pstm;
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      if( rs.next() ){
        bean = mapRow(rs);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw  new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }
  
  /**
   * La consulta se realiza en función de los
   * siguentes campos: 
   *    - codigo
   *    - paterno
   *    - materno
   *    - nombre
   * @param bean
   * @return 
   */
  public List<Cliente> traerClientes(Cliente bean){
    List<Cliente> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT 
              + " where chr_cliecodigo like concat(?,'%') "
              + " and vch_cliepaterno like concat(?,'%') "
              + " and vch_cliematerno like concat(?,'%') "
              + " and vch_clienombre like concat(?,'%') ";
      PreparedStatement pstm;
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getCodigo());
      pstm.setString(2, bean.getPaterno());
      pstm.setString(3, bean.getMaterno());
      pstm.setString(4, bean.getNombre());
      ResultSet rs = pstm.executeQuery();
      while( rs.next() ){
        lista.add(mapRow(rs));
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw  new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }

  @Override
  public Cliente mapRow(ResultSet rs) throws SQLException {
    Cliente bean = new Cliente();
    bean.setCodigo(rs.getString("chr_cliecodigo"));
    bean.setPaterno(rs.getString("vch_cliepaterno"));
    bean.setMaterno(rs.getString("vch_cliematerno"));
    bean.setNombre(rs.getString("vch_clienombre"));
    bean.setDni(rs.getString("chr_cliedni"));
    bean.setCiudad(rs.getString("vch_clieciudad"));
    bean.setDireccion(rs.getString("vch_cliedireccion"));
    bean.setTelefono(rs.getString("vch_clietelefono"));
    bean.setEmail(rs.getString("vch_clieemail"));
    return bean;
  }

  
}
