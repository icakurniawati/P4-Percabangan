public class CaseSwitch {

    public static void main(String[] args){
        String color = "Blue";
        switch(color){
        case "Blue":
            System.out.println("My Favorite Color Is Blue");
            break;
        case "Red":
             System.out.println("My Favorite Color Is Red");
             break;
        case "Green":
             System.out.println("My Favorite Color Is Green");
        
       default:
             System.out.println("My Favorite Color Is Black");
        }
    }
}