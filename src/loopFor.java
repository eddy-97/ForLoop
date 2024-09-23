public class loopFor {
    
    public static void main(String[] args) {
        
        first:
            for (int i = 0; i < 5; i++) {
            
             secound:
                   for (int j = 0; j < 5; j++) {
                        if (i == 1 && j == 1) {
                            continue first;
                        }

                 System.out.println(i + " " + j);       
                   }    
            }
    }
}
