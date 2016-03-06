
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    // instance variables - replace the example below with your own
    private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        numeroTestsFallados=0;
        AgendaTelefonica map = new AgendaTelefonica();
        
        numeroTestsFallados += testea(0,map.tamaño(), "tamaño()");
        numeroTestsFallados += testea(true, map.estaVacio(), ".estaVacio()");
        map.clear();
        numeroTestsFallados += testea(0, map.tamaño(), "clear()");
        
        //añadir datos
        map.put("1","1");
        map.put("3","3");
        
        numeroTestsFallados += testea("1", map.lookupNumber("1"), "put(String,String)");
        numeroTestsFallados += testea("3", map.lookupNumber("3"), "put(String,String");
        
        numeroTestsFallados += testea(2, map.tamaño(), "size()");    
        numeroTestsFallados += testea(false, map.estaVacio(), "isEmpty()");
        
        map.clear();
        numeroTestsFallados += testea(0, map.tamaño(), "clear()");
        
        //si contiene un valor dado
        for (int i=0 ; i<10 ; i++)
        {
            map.put(Integer.toString(i), Integer.toString(i));
        }
         numeroTestsFallados += testea(10, map.tamaño(), "size()"); 
        
        numeroTestsFallados += testea(true, map.containsKey("5"), "containsKey(String)");
        numeroTestsFallados += testea(true, map.containsValue("5"), "containsValue(String)");
        numeroTestsFallados += testea(true, map.containsKey("0"), "containsKey(String)");
        numeroTestsFallados += testea(true, map.containsValue("0"), "containsValue(String)");
        numeroTestsFallados += testea(true, map.containsKey("9"), "containsKey(String)");
        numeroTestsFallados += testea(true, map.containsValue("9"), "containsValue(String)");
        numeroTestsFallados += testea(false, map.containsKey("10"), "containsKey(String)");
        numeroTestsFallados += testea(false, map.containsValue("10"), "containsValue(String)");

        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados  + " tests!!!");
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
