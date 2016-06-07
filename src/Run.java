import Products.Silla;
import builders.SillaBuilder;
import builders.SillaInfantilBuilder;
import builders.SillaOficinaBuilder;

/**
 * Created by Victor on 7/6/16.
 */
public class Run {
    public static void main(String[] args) {
        SillaBuilder builder = new SillaInfantilBuilder(); //Creamos nuestro builder para una silla infantil

        Director director = new Director(builder);   //pasamos el builder concreto de la silla infantil al director

        Silla sillaInfantil = director.crearSilla(); //el director hace uso del builder y crea el obj silla apropiado
        System.out.println(sillaInfantil.toString());   //sacamos una descripción de la silla


        builder = new SillaOficinaBuilder();

        director = new Director(builder);
        Silla sillaOficina = director.crearSilla();
        System.out.println(sillaOficina.toString());
    }
}