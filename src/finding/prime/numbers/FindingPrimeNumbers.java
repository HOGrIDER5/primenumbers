/*
* Amer Stas
* 27/0/2020
* This program wil find all the prime numbers in a given boundery.
*/

package finding.prime.numbers;

public class FindingPrimeNumbers {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    String prime="";
    int counter =0;
    for (int i=2; i<1001;i++){
        for (int j=2; j<i;j++){
        if (i%j !=0){
            System.out.println("It's a prime");
            counter ++;
            prime = prime+j+"\n";
        }    
  
    
        
   }
        System.out.println("The prime numbers are" + prime);
    

}
}
