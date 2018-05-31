public class SumExample2 {
        public static int sum(int lowerBound, int upperBound){
            return upperBound*(upperBound +1)/2 - //sum 1 through upperBound
                    (lowerBound -1) * (lowerBound)/2; //subtract sum 1 through lowerBound-1
                                                    //lowerBound +1 -1 simplifies
        }

        public static void main(String[] args) {
            // int currentSum = sum(1, 10);
            System.out.println("Sum from 1 to 10 is " + sum(1, 10));
            System.out.println("Sum from 20 to 30 is " + sum(20, 30));
            System.out.println("Sum from 35 to 45 is " + sum(35, 45));
        }



}

