import java.util.*;

public class DanceRevolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
       
        String[] instructions = new String[n];
        for (int i = 0; i < n; i++) {
            instructions[i] = scanner.nextLine();
        }
        
     
        String leftFoot = "down";
        String rightFoot = "right";
        int moves = 0;
        
       
        for (String instruction : instructions) {
            if (!instruction.equals(leftFoot) && !instruction.equals(rightFoot)) {
               
                if (isCloser(leftFoot, instruction)) {
                    leftFoot = instruction;
                } else {
                    rightFoot = instruction;
                }
                moves++;
            }
        }
        
        
        System.out.println(moves);
        scanner.close();
    }

    
    private static boolean isCloser(String currentFoot, String targetFoot) {
       
        return currentFoot.equals("down");
    }
}