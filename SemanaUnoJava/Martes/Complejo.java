public class Complejo{
    private double real;
    private double imaginario;
    public Complejo (){
        real = 0.0;
        imaginario = 0.0;
    }
    public Complejo (double real, double im){
        this.real = real;
        imaginario = im;
    }    
    public void getComplejo(double r, double i){
        real = r;
        imaginario = i;
    }    
    public void setReal(double numeroReal){
        real = numeroReal;
    }    
    public void setImaginario(double numeroImaginario){
        imaginario = numeroImaginario;
    }    
    public double getReal(){
        return real;
    }    
    public double getImaginario(){
        return imaginario;
    }    
    public Complejo suma(Complejo sumando){
        Complejo resultado;
        resultado = new Complejo();         
        resultado.setReal(this.real + sumando.getReal() );         
        resultado.setImaginario(this.imaginario + sumando.getImaginario());      
        return resultado;
    }    
    public Complejo resta (Complejo resta){
        Complejo resultado;
        resultado = new Complejo();         
        resultado.setReal(this.real - resta.getReal() );         
        resultado.setImaginario(this.imaginario - resta.getImaginario());         
        return resultado;
    }    
    public Complejo multiplicacion (Complejo producto){
        Complejo resultado;
        resultado = new Complejo();         
        resultado.getComplejo(((this.real * producto.getReal())-

            (this.imaginario * producto.getImaginario())),
            ((this.real * producto.getImaginario() ) + 

            (this.imaginario * producto.getReal() )));
        return resultado;
    }
    public Complejo division(Complejo divisor){
        Complejo resultado;
        resultado = new Complejo();         
        resultado.getComplejo((((this.real * divisor.getReal()) + 

            (this.imaginario * divisor.getImaginario()))/
            ((divisor.getReal() * divisor.getReal())+

            (divisor.getImaginario() * divisor.getImaginario()))),
            (((this.real * divisor.getImaginario() ) - 

            (this.imaginario * divisor.getReal() ))/((divisor.getReal() * 
            divisor.getReal())+(divisor.getImaginario() * 

            divisor.getImaginario()))));
        return resultado;
    }
     
    public static double ang(Complejo a)
  {
    double angulo = Math.atan2(a.imaginario,a.real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public static double magnitud(Complejo a)
  {
    double mag=Math.sqrt(Math.pow(a.real,2)+Math.pow(a.imaginario,2));
    return mag;
  }

    }    
