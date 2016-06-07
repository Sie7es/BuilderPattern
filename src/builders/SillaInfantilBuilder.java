package builders;

import Products.Silla;
import Products.SillaInfantil;

/**
 * Created by Victor on 7/6/16.
 */

/*
    Este será un Builder concreto para una silla infantil. Heredará de nuestro Builder abstracto (builders.SillaBuilder) e implementará
    la lógica necesaria para la creación de una silla infantil en cada uno de los métodos abstractos que implementa.
    Recordemos que en el builder abstracto tenemos una propiedad de tipo Products.Silla, en ella vamos metiendo los valores apropiados para
    nuestro tipo de silla infantil.
 */
public class SillaInfantilBuilder extends SillaBuilder {
    private static final String COLORES_DISPONIBLES = "ROJO, AMARILLO, VERDE, AZUL Y ROSADO";
    public static final String MATERIALES_DISPONIBLES = "PLÁSTICO";

    public SillaInfantilBuilder() {
        silla = new SillaInfantil();
    }

    @Override
    public void setRespaldo() {
        silla.setConRespaldo(false);
    }

    @Override
    public void setRuedas() {
        silla.setConRuedas(false);
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