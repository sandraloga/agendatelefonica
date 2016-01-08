
/**
 + * Imaginemos que tenemos un amigo programador en Java como nosotros que quiere hacer una aplicación para teléfonos Android consistente en un reloj 
 + * en formato 24 horas, que muestre las horas y minutos desde las 00:00 hasta las 23:59.
 + *
 + *Como anda muy apurado de tiempo, nos pide que le hagamos parte del trabajo. Concretamente necesita que le programemos una clase llamada ClockDisplay que:
 + *
 + *Permita fijar un momento determinado de tiempo expresado en horas y minutos. Por ejemplo, si yo le indico a un método 23 y 45 como parámetros, el tiempo 
 + * del reloj debe quedar fijado a 23:45. El nombre del método debe ser setTime.
 + *Permita hacer avanzar un minuto el tiempo fijado. Evidentemente, el usuario podrá invocar este método tantas veces como quiera. El nombre del método debe ser timeTick.
 + *Devolver una cadena de 5 caracteres consistente en la hora y los minutos separados por dos puntos. El nombre del método debe ser getTime. Ojo: la cadena siempre debe
 + *tener 5 caracteres.
 + *
 + *Es muy posible que no seas capaz de completar la actividad. No te preocupes, el objetivo es intentarlo.
 + */
 
public class ClockDisplay
{
    // tiempo guardado en horas
    private int horas;
    //tiempo guardado en minutos
    private int minutos;

    /**
     * crea un bojeto de la clase ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        horas = 0;
        minutos = 0;
    }

    /**
     * Introducir una hora desde 00:00 hasta 23:59
     */
    public void setHora(int hora,int min)
    {
        if (hora>=0 & hora<=23 & min>=0 & min<=59)
         {
           horas = hora;
           minutos = min;
         }
         else
         {
           System.out.println ("La hora no es correcta");   
         }
        
    }
   /**
    * Creado metodo para aumentar minuto a minuto, si las horas fuesen 24 
    * se pondrian a 0 y si los minutos llegaran a 59 pasan a ser 0 y se suma 1 hora
    */
   public void TimeTick()
   {
   if (minutos == 60)
   {
     horas += 1;
     minutos = 0;
   }
   else
   {
     minutos += 1; 
   }
   if (horas == 24)
   {
      horas = 0; 
    }
   }
   
   /**
    *  Devuelve una cadena de 5 caracteres mostrando la
    *  hora separada de los minutos mediante dos puntos.
    */
  public String getTime()
  {
      String horaDelReloj;
      if (horas < 10 & minutos > 10) {
          horaDelReloj = "0" + horas + ":" + "0" + minutos;
        }
        else if (horas < 10 & minutos >= 10) {
            horaDelReloj = "0" + horas + ":" + minutos;
        }
        else if (horas >= 10 & minutos < 10) {
            horaDelReloj = horas + ":" + "0" + minutos;
        }
        else {
            horaDelReloj = horas + ":" + minutos;
        }
        return horaDelReloj;
  
    }  
  }



