
package mockitotest;


public class CalcService  {
  
    
    ICalculator cal;
    public int add(int x , int y){
        return cal.add(x,y);
    }

    public void setCal(ICalculator cal) {
        this.cal = cal;
    }

   

    
    
}