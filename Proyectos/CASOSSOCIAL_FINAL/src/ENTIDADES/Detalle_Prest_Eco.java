
package ENTIDADES;

public class Detalle_Prest_Eco {
    String cod_prest_eco_form;
    String tipo_pago_prest;
    String tipo_tram_prest;
    String fech_ini_bene_prest;
    String fech_fin_bene_prest;
    private int monto_subs;
    int dias_subs_bene_prest;
    String fech_pago_sub;
    int per_cob_hij;
    String vig_neonato;
    String vig_hij_inc;

    public Detalle_Prest_Eco() {
    }

    public String getCod_prest_eco_form() {
        return cod_prest_eco_form;
    }

    public void setCod_prest_eco_form(String cod_prest_eco_form) {
        this.cod_prest_eco_form = cod_prest_eco_form;
    }

    public String getTipo_pago_prest() {
        return tipo_pago_prest;
    }

    public void setTipo_pago_prest(String tipo_pago_prest) {
        this.tipo_pago_prest = tipo_pago_prest;
    }

    public String getTipo_tram_prest() {
        return tipo_tram_prest;
    }

    public void setTipo_tram_prest(String tipo_tram_prest) {
        this.tipo_tram_prest = tipo_tram_prest;
    }

    public String getFech_ini_bene_prest() {
        return fech_ini_bene_prest;
    }

    public void setFech_ini_bene_prest(String fech_ini_bene_prest) {
        this.fech_ini_bene_prest = fech_ini_bene_prest;
    }

    public String getFech_fin_bene_prest() {
        return fech_fin_bene_prest;
    }

    public void setFech_fin_bene_prest(String fech_fin_bene_prest) {
        this.fech_fin_bene_prest = fech_fin_bene_prest;
    }

    public int getDias_subs_bene_prest() {
        return dias_subs_bene_prest;
    }

    public void setDias_subs_bene_prest(int dias_subs_bene_prest) {
        this.dias_subs_bene_prest = dias_subs_bene_prest;
    }

    public String getFech_pago_sub() {
        return fech_pago_sub;
    }

    public void setFech_pago_sub(String fech_pago_sub) {
        this.fech_pago_sub = fech_pago_sub;
    }

    public int getPer_cob_hij() {
        return per_cob_hij;
    }

    public void setPer_cob_hij(int per_cob_hij) {
        this.per_cob_hij = per_cob_hij;
    }

    public String getVig_neonato() {
        return vig_neonato;
    }

    public void setVig_neonato(String vig_neonato) {
        this.vig_neonato = vig_neonato;
    }

    public String getVig_hij_inc() {
        return vig_hij_inc;
    }

    public void setVig_hij_inc(String vig_hij_inc) {
        this.vig_hij_inc = vig_hij_inc;
    }

    public int getMonto_subs() {
        return monto_subs;
    }

    public void setMonto_subs(int monto_subs) {
        this.monto_subs = monto_subs;
    }
    
    
}
