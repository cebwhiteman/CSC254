public class Test {
    public static void main(String[] args) {

                for(int i=1; i<10; i++) {
                    for(int k=5; k<20; k += 5) {
                        System.out.println(i + k);
                        if(k % i == 0) {
                            continue;
                        }
                    }
                    if(i % 4 == 0) {
                        break;
                    }
                }
            }
        }

