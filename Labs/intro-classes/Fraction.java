import java.math.BigInteger;

/**
 * A simple implementation of Fractions.
 * 
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @version 1.2 of August 2023
 */


public class Fraction {
  // +------------------+---------------------------------------------
  // | Design Decisions |
  // +------------------+
  /*
   * (1) Denominators are always positive. Therefore, negative fractions are represented 
   * with a negative numerator. Similarly, if a fraction has a negative numerator, it 
   * is negative.
   * 
   * (2) Fractions are not necessarily stored in simplified form. To obtain a fraction 
   * in simplified form, one must call the `simplify` method.
   */

  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  /** The numerator of the fraction. Can be positive, zero or negative. */
  BigInteger num;

  /** The denominator of the fraction. Must be non-negative. */
  BigInteger denom;

  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new fraction with numerator num and denominator denom.
   * 
   * Warning! Not yet stable.
   */
  public Fraction(BigInteger num, BigInteger denom) {
    this.num = num;
    this.denom = denom;
  } // Fraction(BigInteger, BigInteger)

  /**
   * Build a new fraction with numeimport fraction;rator num and denominator denom.
   * 
   * Warning! Not yet stable.
   */
  public Fraction(int num, int denom) {
    this.num = BigInteger.valueOf(num);
    this.denom = BigInteger.valueOf(denom);
  } // Fraction(int, int)

  /**
   * Build a new fraction by parsing a string.
   *
   * Warning! Not yet implemented.
   */
  public Fraction(String str) {
    String numera = str.substring(0, str.indexOf('/'));
    String denomi = str.substring(str.indexOf('/'),str.length());
    this.num = new BigInteger(numera);
    this.denom = new BigInteger(denomi);
  }

///Counter
public class Counter {
  private int count;

  public Counter() {
    this.count = 0;
  }

  public void increment() {
    this.count++;
  }

  public int getCount() {
    return this.count;
  }
}



// Fraction

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Express this fraction as a double.
   */
  public double doubleValue() {
    return this.num.doubleValue() / this.denom.doubleValue();
  } // doubleValue()





    public Fraction multiply(Fraction multiplyMe){ 
       BigInteger resultNumerator;
       BigInteger resultDenominator;
       resultDenominator = this.denom.multiply(multiplyMe.denom);
       resultNumerator = this.num.multiply(multiplyMe.num);
       return new Fraction(resultNumerator, resultDenominator);
    }



  /**
   * Add the fraction `addMe` to this fraction.
   */


  public Fraction fractional(){
    return new Fraction(this.num.mod(this.denom), this.denom);
  }



  public Fraction add(Fraction addMe) {
    BigInteger resultNumerator;
    BigInteger resultDenominator;

    // The denominator of the result is the
    // product of this object's denominator
    // and addMe's denominator
    resultDenominator = this.denom.multiply(addMe.denom);
    // The numerator is more complicated
    resultNumerator = (this.num.multiply(addMe.denom)).add(addMe.num.multiply(this.denom));

    // Return the computed value
    return new Fraction(resultNumerator, resultDenominator);
  }// add(Fraction)

  /**
   * Get the denominator of this fraction.
   */
  public BigInteger denominator() {
    return this.denom;
  } // denominator()
  
  /**
   * Get the numerator of this fraction.
   */
  public BigInteger numerator() {
    return this.num;
  } // numerator()
  
  /**
   * Convert this fraction to a string for ease of printing.
   */
  public String toString() {
    // Special case: It's zero
    if (this.num.equals(BigInteger.ZERO)) {
      return "0";
    } // if it's zero

    // Lump together the string represention of the numerator,
    // a slash, and the string representation of the denominator
    // return this.num.toString().concat("/").concat(this.denom.toString());
    return this.num + "/" + this.denom;
  } // toString()
}

