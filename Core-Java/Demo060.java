public class Demo060 {
    public static void main(String[] args){
        
                int n = 20;
                int first = 0, second = 1;
                
                System.out.println("Fibonacci Series up to " + n + " terms:");
                
                for (int i = 1; i <= n; i++) {
                    System.out.print(first + " ");
                    int next = first + second;
                    first = second;
                    second = next;
                }
            }
        }
    