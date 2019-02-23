package preorden;
public class Arbol {
    
    
  //Metodo Preorden
  public static void preOrden(Nodo raiz) {
    if (raiz != null) {
      System.out.print(raiz.getDato() + " ");
      preOrden(raiz.getNodoIzquierdo());
      preOrden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo Inorden
  public static void inorden(Nodo raiz) {
    if (raiz != null) {
      inorden(raiz.getNodoIzquierdo());
      System.out.print(raiz.getDato()+ " ");
      inorden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo PostOrden
    public static void posOrden(Nodo raiz) {
        if (raiz != null) {
            posOrden(raiz.getNodoIzquierdo());
            posOrden(raiz.getNodoDerecho());
            System.out.print(raiz.getDato() + " ");
        }
    }
}
