package Products;

/**
 * Created by Victor on 7/6/16.
 */


/*
    Lo primero que creamos es nuestro producto. En este ejemplo es una silla con diferentes propiedades. Creamos los getters y setters.
 */
public class Silla {
    private boolean conRespaldo;
    private boolean conRuedas;
    private String color;
    private String material;

    public boolean isConRespaldo() {
        return conRespaldo;
    }

    public void setConRespaldo(boolean conRespaldo) {
        this.conRespaldo = conRespaldo;
    }

    public boolean isConRuedas() {
        return conRuedas;
    }

    public void setConRuedas(boolean conRuedas) {
        this.conRuedas = conRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
