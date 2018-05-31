public class Lab3b {
    public static void main(String[] args) {
        double x = 1.0;
        double mean = 3.0;//the variable mean = μ//
        double standardDeviation = 1.0; //the variable standardDeviation = σ//
        double sigmaSigma = 2*standardDeviation* //sigmaSigma=2σ^2//
          standardDeviation;
        double NPD=(1/(Math.sqrt(Math.PI*sigmaSigma))/*creates a variable for 
        normal probability density**/
        *(Math.pow(Math.E,-((x-mean)*(x-mean)))/(sigmaSigma)));          
        System.out.println("The Normal Probability Density is:");
        System.out.println(NPD);/*prints out the normal probability density**/
    }
}
    
    
