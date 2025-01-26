import java.util.*;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter one of the following\nRock\nPaper\nScissor");
        System.out.print("Your response: ");
        String user = sc.nextLine().toLowerCase();
        int com = ran.nextInt(3);
        String com1 = "";
        if(com == 0){
            com1 = "rock";
        }else if(com == 0){
            com1 = "paper";
        }else{
            com1 = "scissor";
        }
        if(com1.equals(user)){
            System.out.println("Draw");
        }else if(user == "rock" && com1 == "paper"){
            System.out.println(com1);
            System.out.println("You lost");
        }else if(user == "paper" && com1 == "scissor"){
            System.out.println(com1);
            System.out.println("You lost");
        }else if(user == "scissor" && com1 == "rock"){
            System.out.println(com1);
            System.out.println("You lost");
        }else{
            System.out.println(com1);
            System.out.println("You won");
        }
    }
}
