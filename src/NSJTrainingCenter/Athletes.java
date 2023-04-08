package NSJTrainingCenter;
public class Athletes {
    public static void main(String[] args) {
        //declare the variable
        String welcomeMessage = "Hello Welcome to North Sussex Judo Training Center!!";
        String infoMessage = "Please Fill the following Information";
        //1 is for bold and 35 is for color and 20m is for font style and 0m is for reset and \033 is escape code
        System.out.println("\033[1;35;20m" + middleComponent(welcomeMessage) + "\033[0m");
        System.out.println(middleComponent(infoMessage));//call middleComponent method to display the string to center

        Input userInput = new Input(); //call Input Class
        userInput.getUserInput(); // user add the data in getUserInput()

        //cost Calculation
        float totalChosePlanCost =  userInput.totalCosts(userInput.getTrainingPlan());//call totalCosts from weightandCompetitioncal which is extended by Input

        float totalPrivateCost = userInput.getTotalPrivateCoaching() != 0 ?userInput.totalPrivateCost(userInput.getTotalPrivateCoaching() * 4):0;

        float totalCompetitionCost = !userInput.getTrainingPlan().equals("beginner")?userInput.totalCompetitionCost(userInput.getTotalCOmpetitions()):0;
        // user information

        System.out.println("\033[1;35;20m"+"Athlete's Detail"+"\033[0m");

        System.out.println("Athlete's Name: " + userInput.getName());

        System.out.println("Athlete's Choose Plan: " + userInput.getTrainingPlan());

        System.out.println("Monthly cost of Athlete's chose plan: " + "$" + totalChosePlanCost );

        System.out.println("Total sections: " + userInput.totalSessions(userInput.getTrainingPlan()) + "sessions");


        if(userInput.getTotalPrivateCoaching() != 0){
            System.out.println("Total Hour for Private Coach: " + userInput.getTotalPrivateCoaching() * 4 + "hrs");
            System.out.println("Total Cost for Private Coach: " + "$" +  totalPrivateCost);
        }
        if(!userInput.getTrainingPlan().equals("beginner")){
            System.out.println("Total Competition: " + userInput.getTotalCOmpetitions());
            System.out.println("Total Amount of Competition: " + "$" +  totalCompetitionCost);
        }

        System.out.println("Total amount: " + (totalChosePlanCost+totalPrivateCost+totalCompetitionCost));

        userInput.compareCompetitionandWeight();

        //user information
    }

    public static String middleComponent(String sentence) {
        int length = sentence.length(); //length of the string
        int middle = 70; // assuming console width of 80 characters

        // make sentence to middle
        String centeredSentence = String.format("%" + (middle + length/2) + "s", sentence);
        centeredSentence = centeredSentence + String.format("%" + (80 - centeredSentence.length()) + "s", "");

        return centeredSentence;
    }


}