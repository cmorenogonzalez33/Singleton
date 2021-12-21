package singleton;

class Singleton 
{
  private static String cadena;
  
  private static Singleton instance; 
  
  private Singleton(String cad)
  {
	  cadena = cad;
  }
  public static Singleton getInstance(String cad) 
  {
    if(instance == null) 
    {
      instance = new Singleton(cad);
    }
    return instance;
  }
  
  public static void main(String[] args) 
  {
	String cade = "prueba";
	String caden = "prueba2";
    Singleton instance = Singleton.getInstance(cade);
    System.out.println(instance);
    
    Singleton instance1 = Singleton.getInstance(caden); 
    System.out.println(instance1);
  }
}
