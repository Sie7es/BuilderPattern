package builders;

import Products.Silla;
import Products.SillaOficina;

/**
 * Created by Victor on 7/6/16.
 */

/*
    Este será un Builder concreto para una silla de oficina. Heredará de nuestro Builder abstracto (builders.SillaBuilder) e implementará
    la lógica necesaria para la creación de una silla de oficina en cada uno de los métodos abstractos que implementa.
    Recordemos que en el builder abstracto tenemos una propiedad de tipo Products.Silla, en ella vamos metiendo los valores apropiados para
    nuestro tipo de silla de oficina.
 */
public class SillaOficinaBuilder extends SillaBuilder {
    private static final String COLORES_DISPONIBLES = "ROJO Y NEGRO";
    public static final String MATERIALES_DISPONIBLES = "MADERA, PLÁSTICO Y ALUMINIO";

    public SillaOficinaBuilder() {
        silla = new SillaOficina();
    }

    @Override
    public void setRespaldo() {
        silla.setConRespaldo(true);
    }

    @Override
    public void setRuedas() {
        silla.setConRuedas(true);
    }

    @Override
    public void setColor() {
        silla.setColor(COLORES_DISPONIBLES);
    }

    @Override
    public void setMaterial() {
        silla.setMaterial(MATERIALES_DISPONIBLES);
    }

}