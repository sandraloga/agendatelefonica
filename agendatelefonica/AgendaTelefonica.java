import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own

    private HashMap<String,String> agenda;
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void put(String name, String number)
    {
        agenda.put(name,number);
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }
    /**
     * devueelv el tamaño del objeto HashMap
     */
    public int tamaño()
    {
        return agenda.size();
    }
    /**
     * comprueba si una determinada clave ya existe en un objeto de tipo HashMap
     */
    public boolean containsKey(String key)
    {
        return agenda.containsKey(key);
    }
    /**
     * comprueba q contiene un valor dado
     */
    public boolean containsValue(String value)
    {
        return agenda.containsValue(value);
    }
    /** 
     * Print all keys
     */
    public void printAllNames()
    {
        System.out.println( agenda.keySet());
    }
    /**
     * comprueba si esta vacio
     */
    
    public boolean estaVacio() {
        return agenda.isEmpty();
        
    }
    /**
     * vacia el hashMap
     */
    public void clear()
    {
        agenda.clear();
    }
}

