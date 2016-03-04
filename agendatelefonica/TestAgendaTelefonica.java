
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    // instance variables - replace the example below with your own
    private int contadorFallos;

    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        contadorFallos=0;
        AgendaTelefonica  agenda = new AgendaTelefonica();
        
        
        
        if (contadorFallos == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + contadorFallos + " tests!!!");
        }
        
    }
    
    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }

   
}
