
package ENTIDADES;

public class Detalle_Registro {
    String cod_reg_form;
    String tipo_per_sol;
    String tipo_reg;
    String motiv_baja;
    String fech_motiv_baj;
    int monto_ing_neto_agro;

    public Detalle_Registro() {
    }

    public String getCod_reg_form() {
        return cod_reg_form;
    }

    public void setCod_reg_form(String cod_reg_form) {
        this.cod_reg_form = cod_reg_form;
    }

    public String getTipo_per_sol() {
        return tipo_per_sol;
    }

    public void setTipo_per_sol(String tipo_per_sol) {
        this.tipo_per_sol = tipo_per_sol;
    }

    public String getTipo_reg() {
        return tipo_reg;
    }

    public void setTipo_reg(String tipo_reg) {
        this.tipo_reg = tipo_reg;
    }

    public String getMotiv_baja() {
        return motiv_baja;
    }

    public void setMotiv_baja(String motiv_baja) {
        this.motiv_baja = motiv_baja;
    }

    public String getFech_motiv_baj() {
        return fech_motiv_baj;
    }

    public void setFech_motiv_baj(String fech_motiv_baj) {
        this.fech_motiv_baj = fech_motiv_baj;
    }

    public int getMonto_ing_neto_agro() {
        return monto_ing_neto_agro;
    }

    public void setMonto_ing_neto_agro(int monto_ing_neto_agro) {
        this.monto_ing_neto_agro =  monto_ing_neto_agro;
    }
    
}
