/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *creates terms of polynomials. that can later be arranged, added and simplified .
 * @author Julio Andres
 */
public class Term 
{
    private int coeff; //terms coeffiecient
    private int expo;  //terms exponent  
    /**
     * creates a placeholder for a leading coefficient of a term and its exponent
     * @param c leading coefficient of the them
     * @param e exponent of the term
     */
    public Term(int coeff,int expo)
    {
      this.coeff = coeff;
      this.expo = expo;      
    }


    
    /**
     * gets the current value of the coefficient
     * @return the current value of the coefficient
     */
    public int getCoef()
    {
        return coeff;
    }
    
    /**
     * gets the current value of the exponent
     * @return the current value of the exponent
     */
    public int getExpo()
    {
        return expo;
    }
    
    /**
     * 
     * gets values from the term coefficient and turns it into a string.
     * checks for cases of coefficient
     * sets strTerm to the case referenced.
     * @return 
     */
    
    @Override
    public String toString()
    {
        String strTerm = " ";
        String a = Integer.toString(coeff);
        String b = Integer.toString(expo);
        if(coeff == 1)
        {
            strTerm = "X^" +b;
        }
        else if(expo == 1)
        {
            strTerm = a +"X";
        }
        else if(expo == 0)
        {
            strTerm = a;
        }
        else if(coeff==1 && expo ==1)
        {
            strTerm = "X";            
        }
        else
        {
            strTerm = a +"X^" +b;
        }
        return strTerm;
    }

}
