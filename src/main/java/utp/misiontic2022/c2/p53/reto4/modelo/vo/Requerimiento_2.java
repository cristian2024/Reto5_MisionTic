package utp.misiontic2022.c2.p53.reto4.modelo.vo;

public class Requerimiento_2 {
    // Su código
    private String proveedor;
    private String constructora;
    private String pagado;


    


    public Requerimiento_2(String proveedor, String constructora, String pagado) {
        this.proveedor = proveedor;
        this.constructora = constructora;
        this.pagado = pagado;
    }


    public Requerimiento_2() {
    }

    
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getPagado() {
        return pagado;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    

}
