package Products;

import Products.Silla;

/**
 * Created by Victor on 7/6/16.
 */
public class SillaOficina extends Silla {
    @Override
    public String toString() {
        return "CARACTERÍSTICAS DE LA SILLA DE FOCINA:" + "\n"
                + "CON RESPALDO: " + (isConRespaldo() ? "Sí" : "NO") + "\n"
                + "CON RUEDAS: " + (isConRuedas() ? "Sí" : "NO") + "\n"
                + "COLORES DISPONIBLES: " + getColor() + "\n"
                + "MATERIALES DISPONIBLES: " + getMaterial();
    }
}
