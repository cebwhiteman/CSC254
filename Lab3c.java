/*lab for Caroline Whiteman and Devin Mattoon. We are submitting two versions 
   of our code. This is the version according to the directions and Devin will 
   upload our second version where we used μ and σ as variables in place of 
   mean and standard deviation**/ 
public class Lab3c {
    public static void main(String[] args) {
        double x = 1.0;
        double mean = 3.0;//the variable mean = μ//
        double standardDeviation = 1.0; //the variable standardDeviation = σ//
        double sigmaSigma = 2*standardDeviation* //sigmaSigma=2σ^2//
          standardDeviation;
        double NPD=1/(Math.sqrt(Math.PI*sigmaSigma))/*creates a variable for 
        normal probability density**/
        *Math.pow(Math.E,-((x-mean)*(x-mean))/(sigmaSigma));          
        System.out.println("The Normal Probability Density is:");
        System.out.println(NPD);/*prints out the normal probability density**/
    }
}
  