/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author Familia
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia m1 = new Materia(1, "Inglés 1", 1);
        Materia m2 = new Materia (2, "Matemáticas", 1);
        Materia m3 = new Materia (3,"Laboratorio 1", 1);
        
        Alumno alum1 = new Alumno (1001, "López", "Martín");
        Alumno alum2 = new Alumno (1002, "Martínez", "Brenda");
        
        alum1.agregarMateria(m1);
        alum1.agregarMateria(m2);
        alum1.agregarMateria(m3);
        
        alum2.agregarMateria(m1);
        alum2.agregarMateria(m2);
        alum2.agregarMateria(m3);
        alum2.agregarMateria(m3);
        
        System.out.println("Alumno: "+alum1.getApellido()+" "+alum1.getNombre()+ " está inscripto en "+alum1.cantidadMaterias()+" materias");
        
        System.out.println("Alumna: "+alum2.getApellido()+" "+alum2.getNombre()+ " está inscripta en "+alum2.cantidadMaterias()+" materias");
        
        
    }
    
}
