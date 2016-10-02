
package ENTIDADES;

public class Derechohabiente extends Persona {
    String vin_tit_per_reg;
    String fech_prob_part;
    String tipo_inc_lab_hij;
    String cod_tit_der;

    public Derechohabiente() {
    }

    public String getVin_tit_per_reg() {
        return vin_tit_per_reg;
    }

    public void setVin_tit_per_reg(String vin_tit_per_reg) {
        this.vin_tit_per_reg = vin_tit_per_reg;
    }

    public String getFech_prob_part() {
        return fech_prob_part;
    }

    public void setFech_prob_part(String fech_prob_part) {
        this.fech_prob_part = fech_prob_part;
    }

    public String getTipo_inc_lab_hij() {
        return tipo_inc_lab_hij;
    }

    public void setTipo_inc_lab_hij(String tipo_inc_lab_hij) {
        this.tipo_inc_lab_hij = tipo_inc_lab_hij;
    }

    public String getCod_tit_der() {
        return cod_tit_der;
    }

    public void setCod_tit_der(String cod_tit_der) {
        this.cod_tit_der = cod_tit_der;
    }
    
    
}
