/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 202
 */
public class MEmpleado {
    private String nombre,apellido, financiacion, fechadenacimiento;    
    private int cedula;
    public MEmpleado(String nombre,String apellido,String finan)
    {
    this.nombre=nombre;
    this.apellido=apellido;
    this.financiacion=finan;        
    
    }
    
    public String toString()
    {
    String h="<br> nombre:"+this.nombre+"</br><br> apellido:"+this.apellido+"</br><br> modo de financiacion:"+this.financiacion+"<br></br> fecha de nacimiento"+this.fechadenacimiento+"</br>";
    return  h;
    }
    
}