package preorden;
public class Nodo {
  //Variables
  private String dato;
  private Nodo izq;
  private Nodo der;
 
  //Constructor 
  public Nodo(String dato){
    this.dato = dato;
  }
  //Para saber el nodo izquierdo
  public Nodo getNodoIzquierdo(){
    return izq;
  }
  //Para saber el nodo derecho
  public Nodo getNodoDerecho(){
    return der;
  }
  //Se crea nodo derecho
  public void setNodoDerecho(Nodo nodo){
    der = nodo;
  }
  //Se crea nodo Izquierdo
  public void setNodoIzquierdo(Nodo nodo){
    izq = nodo;
  }
 
  public String getDato(){
    return dato;
  }
}