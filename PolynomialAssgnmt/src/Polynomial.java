
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Andres
 */
public class Polynomial {
    // do NOT modify this instance variable declaration
   private ArrayList<Term> polynomial ; 
   /**
    * Creates a polynomial with no terms.
    */
   public Polynomial()  // constructor
   {
      polynomial = new ArrayList<Term>();//a list of Term type object
   }
   
   public void addTerm(int coeff, int expo)
   {
      
      Term terms = new Term(coeff,expo) ; //creates an object variable type Term 
      //terms.toString();
      polynomial.add(terms);// adds an object to the polynomial list
       
     }      
  
   public String toString()
   {
      String poly = "";
      for(int i = 0; i < polynomial.size();i++)
        {
          Term polyString = polynomial.get(i);   
          polyString.toString();
          poly = poly +" "+ polyString;
      }
      
      return poly;
   }
      
   // collect terms of a Polynomial object. I.e. replace all terms having the 
   // same exponent with a single term which is their sum
   private void collectTerms()
   {
            
   }
   
   public Polynomial polyMultiply(Polynomial p)
   {
       
       return null ;
   }
   
   public Polynomial polyAdd(Polynomial p)
   {  
      ArrayList<Term> tempPoly = new ArrayList<>(polynomial);
      Polynomial temp = new Polynomial();
     for(int i=0;i < p.polynomial.size();i++)
         {
           tempPoly.add(p.polynomial.get(i));
         }
     System.out.println(tempPoly);
     
    return temp ;
   }
    
}
