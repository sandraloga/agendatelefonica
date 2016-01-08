
/**
 * Write a description of class alimentos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alimentos
{
    // declaramos las variables :proteinas carbohidratos y grasas
    private String nombre;
    private float proteinas;
    private float  carbo;
    private float grasas;
    private float calorias;
    
   

    /**
     * Constructor for objects of class alimentos
     */
    public alimentos(String nombre,float proteinas,float carbo, float grasas)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbo = carbo;
        this.grasas = grasas;
      
      
    
    }
    /**
      * Metodo para calcular calorias
      */
      
    public float valorcalorias()
    {
        
        calorias = (proteinas*4) + (carbo*4) + (grasas*9);
        return calorias;
    }
     /**
      * Metodo para comprobar el o los nutrientes maayoritarios
      */
     public String getNutrienteMayor()
     {
       if (proteinas > carbo)
        {
          if (proteinas > grasas)
          {
              return "Proteinas " + proteinas;
          }
          else
           {
            if (carbo > grasas)
              {
                 return "Carbohidratos" + carbo;
              }
            else
              {
                  return "Grasas" + grasas;
              }
           }
         }
     }

    
    /**
     *Metodo para imprimir por pantalla
     */
    public void mostrarDatos()
    {
        System.out.println ("Nombre:                           " + nombre);
        System.out.println ("Proteinas por cada 100 gramos:    " + proteinas);
        System.out.println ("Carbohidratos por cada 100 gramos: " + carbo);
        System.out.println ("Grasas por cada 100 gramos:        " + grasas);
        System.out.println ("Calorias:                          " + calorias);
        System.out.println ("Componete/s mayoritario/s          " + getNutrienteMayor());
      }
}
