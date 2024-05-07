/*
1. Diseñamos una clase abstracta con el nombre factura, con las siguientes propiedades:
- nfactura
- importe
- iva
- detalle
- totalfinal
2. Todas las propiedades del punto anterior tienen que ser de ámbito private.
3. Los métodos de la clase abstracta son:
- Constructor
- Get y set de cada propiedad
- Mostrardatos()
- Calculariva(), que es el 21% del importe
- Totalfinal(),que es el subtotal + iva
 */

package abstractas;

public abstract class Factura {

    private int nfactura;
    private double importe;
    private double iva;
    private String detalle;
    private double totalfinal;

    //Getters y setters
    public int getNfactura() {
        return nfactura;
    }

    public void setNfactura(int nfactura) {
        this.nfactura = nfactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalfinal() {
        return totalfinal;
    }

    public void setTotalfinal(double totalfinal) {
        this.totalfinal = totalfinal;
    }

    //Constructores
    public Factura(int nfactura, double importe) {
        this.nfactura = nfactura;
        this.importe = importe;
        this.detalle = "Sin detalle";
    }

    public Factura(int nfactura, double importe, String detalle) {
        this.nfactura = nfactura;
        this.importe = importe;
        this.detalle = detalle;
    }

    public void mostrarDatos() {
        System.out.println("Número de factura: " + getNfactura());
        System.out.println("Importe: " + getImporte());
        System.out.println("Detalle: " + getDetalle());
        System.out.println("IVA del producto: " + calcularIva());
        System.out.println("Precio total final: " + totalFinal());
    }

    public double calcularIva() {
        return getImporte() * 0.21;
    }

    public double totalFinal() {
        return calcularIva() + getImporte();
    }
}
