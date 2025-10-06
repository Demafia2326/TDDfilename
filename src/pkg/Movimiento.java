package pkg;

enum Signo {
    D, 
    H  
}


public class Movimiento {
	public Double importe;
	public Signo signo;
	public String detalle;
	

    public Movimiento(double importe, Signo signo, String detalle) {
        this.importe = importe;
        this.signo = signo;
        this.detalle = detalle;
    }

    public double getImporte() {
        return importe;
    }

    public Signo getSigno() {
        return signo;
    }

    public String getDetalle() {
        return detalle;
    }
}
