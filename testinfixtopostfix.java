import java.util.Scanner;
public class testinfixtopostfix {
    public static void main(String[] args) {
        infixtoposfix itp = new infixtopostfix();
        String infix;
        Scanner keyIn = new Scanner(Systen.in);
        //(a+b)/((c-d)*e^f)
        //(A+B)/((C-D)*E^F)
        System.out.print("Infix Expression : ");
        infix = keyIn.nextLine();
        itp.setInfixExp(infix);
        System.out.println("Postfix Expression : " +
                itp.toPostfix());
    } 
}
