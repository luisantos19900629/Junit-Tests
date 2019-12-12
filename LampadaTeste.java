
package lampada;

/**
 *
 * @author Luis Santos
 */
public class LampadaTeste {
  
   public LampadaTeste(){
   
   } 
    
  public boolean utilizarLampada(int ligada){
       
      boolean estado= false;
        
        if (ligada == 1) {
            
            estado=true;
        } else {
            
           estado=false;
        }
      return estado;
    }

}
