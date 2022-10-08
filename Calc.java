import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        System.out.println("Java Calculator (v.alpha0.5) by DeadCode ('Ctrl+C' - quit)");
        while (true){
            try 
            {

            
                Scanner in = new Scanner(System.in);
                System.out.println("Write first number: ");
                float f_num = in.nextFloat();
                
                System.out.println("Write operator(+, -, /, *): ");
                String op = in.next();
                
                System.out.println("Write second number: ");
                float s_num = in.nextFloat();
                
                if (op.equals("+"))
                {
                    float result = f_num + s_num;
                    System.out.println(result);
                }
                else if (op.equals("-"))
                {
                    float result = f_num - s_num;
                    System.out.println(result);
                }
                else if (op.equals("/"))
                {   
                    if (s_num != 0)
                    {
                        float result = f_num / s_num;
                        System.out.println(result);
                    }
                    else {
                        System.out.println("Error. Division by zero");
                    }
                    
                }
                else if (op.equals("*"))
                {
                    float result = f_num * s_num;
                    System.out.println(result);
                }
                else {
                    System.out.println("Input data wrong. Try again. (Ctrl+C - quit)");
                }
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong. Try again. (Ctrl+C - quit)");
            }
        }
        
    }
}
