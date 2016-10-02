
package ENTIDADES;

public class Titular extends Persona{
    String cod_emp_tit;
    String est_lab_tit;

    public Titular() {
    }

    public String getCod_emp_tit() {
        return cod_emp_tit;
    }

    public void setCod_emp_tit(String cod_emp_tit) {
        this.cod_emp_tit = cod_emp_tit;
    }

    public String getEst_lab_tit() {
        return est_lab_tit;
    }

    public void setEst_lab_tit(String est_lab_tit) {
        this.est_lab_tit = est_lab_tit;
    }
    
}
