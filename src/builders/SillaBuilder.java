package builders;

import Products.Silla;

/**
 * Created by Victor on 7/6/16.
 */

/*
    Esta clase abstracta será nuestro builder abstracto. Cualquier builder concreto que herede de ella deberá implemenbar sus métodos
    y la lógica apropiada para cada uno de ellos. Además tenemos la propiedad Products.Silla y el método resultado que nos
    devolverá el obj silla creado. Este método (resultado) será usado desde la clase Director, que es la encargada de crear la Products.Silla
    a partir de un builder concreto.
 */
public abstract class SillaBuilder {
    public Silla silla;

    public abstract void setRespaldo();
    public abstract void setRuedas();
    public abstract void setColor();
    public abstract void setMaterial();

    public Silla resultado(){
        return silla;
    }
}