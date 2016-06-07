import Products.Silla;
import builders.SillaBuilder;

/**
 * Created by Victor on 7/6/16.
 */
public class Director {
    /*
    Esta es nuestra clase director. Tiene un atributo de nuestro builder abstracto builders.SillaBuilder. En el constructor recibe un obj
    de tipo builders.SillaBuilder que por polimorfismo puede ser cuanlquier builder concreto que implemente builders.SillaBuilder. Este obj lo referenciamos
    con nuestra propiedad builder.
    El siguiente método es crearSilla que mediante nuestra referencia builder llama a todos los métodos para que se cree la silla
    con los parámetos apropiados y a continuación la devuelve llamando al método resultado.
     */
    SillaBuilder builder;

    public Director (SillaBuilder builder) {
        this.builder = builder;
    }


    public Silla crearSilla() {
        builder.setRuedas();
        builder.setRespaldo();
        builder.setColor();
        builder.setMaterial();


        return builder.resultado();
    }
}