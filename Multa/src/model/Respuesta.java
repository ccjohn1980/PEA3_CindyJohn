package model;


public class Respuesta {
    private int codigo;
    private String msj;
    private int idGenerado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "codigo=" + codigo + ", msj=" + msj + '}';
    }

    public int getIdGenerado() {
        return idGenerado;
    }

    public void setIdGenerado(int idGenerado) {
        this.idGenerado = idGenerado;
    }
    
    
}
