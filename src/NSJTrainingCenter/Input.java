package NSJTrainingCenter;

import java.util.Scanner;

public class Input extends WeightAndCompetitionCalculation {

    private String name; //athlete's name
    private int current_weight; // athlete's current Weight
    private String training_plan; // athlete's chose training plan such as beginner/intermediate/elite
    private  String competition_weight_category; // athlete current weight category

    private int total_competitions; // all competition

    private int total_private_coaching; // private tuition hour

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // current weight
    public int getCurrentWeight() {
        return current_weight;
    }
    public void setCurrentWeight(int current_weight) {
        this.current_weight = current_weight;
    }
    //training plan
    public String getTrainingPlan(){
        return training_plan;
    }
    public void setTrainingPlan(String training_plan){
        this.training_plan = training_plan;
    }
    //competition weight category
    public String getCompetitionWeightCategory(){
        return competition_weight_category;
    }
    public void setCompetitionWeightCategory(String category){
        //set the current weight
     this.competition_weight_category = category;
       };
    //competition
    public int getTotalCOmpetitions(){
        return total_competitions;
    }


    public void setTotalCompetitions(int totalCompetition){
        this.total_competitions = totalCompetition;
    }
    //private Tuition
    public void setTotalPrivateCoaching(int totalPrivateCoaching){
        this.total_private_coaching = totalPrivateCoaching;
    }

    public int getTotalPrivateCoaching(){
        return total_private_coaching;
    }

    public void compareCompetitionandWeight(){
        int require;
        switch (this.competition_weight_category){
            case "heavyweight":
                if(this.current_weight < 100){
                    require = 100 - this.current_weight;
                    System.out.println("You have to choose your competition category because u choose heavyweight" + "You need to gain" + require + "weight");
                }
                else{
                    System.out.println("You are already in heavyWeight .You have to choose your competition category because u choose heavyweight");
                }
                break;
            case "lightheavyweight":
                if(this.current_weight < 90){
                    require = 90 - this.current_weight;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to gain" + require);
                }
                else if(this.current_weight > 100){
                    require = this.current_weight - 100;
                System.out.println("Your current Weight is " + this.current_weight+ ". You need to loose" + require);}
                else if(this.current_weight>= 90 && this.current_weight < 100){
                    System.out.println("You are at light Heavy Weight! You don't need to do competition");
                }
                break;

            case "middleweight":
                if(this.current_weight < 81){
                    require = 81 - this.current_weight;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to gain" + require);
                }
                else if(this.current_weight > 90) {
                    require = this.current_weight - 90;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to loose" + require);
                }
                else if(this.current_weight>= 81 && this.current_weight < 90){
                    System.out.println("You are at light Heavy Weight! You don't need to do competition");
                }
                break;
            case "lightmiddleweight":
                if(this.current_weight < 73){
                    require = 73 - this.current_weight;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to gain" + require);
                }
                else if(this.current_weight > 81){
                    require = this.current_weight - 81;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to loose" + require);}
                else if(this.current_weight>= 73 && this.current_weight < 81){
                    System.out.println("You are at light Heavy Weight! You don't need to do competition");
                }
                break;
            case "lightweight":
                if(this.current_weight < 66){
                    require = 66 - this.current_weight;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to gain" + require);
                }
                else if(this.current_weight > 73) {
                    require = this.current_weight - 73;
                    System.out.println("Your current Weight is " + this.current_weight+ ". You need to loose" + require);
                }
                else if(this.current_weight>= 66 && this.current_weight < 73){
                    System.out.println("You are at light Heavy Weight! You don't need to do competition");
                }
                break;

            default:
                if(this.current_weight < 66){
                    System.out.println("You are at Fly Weight! You don't need to do competition");
                }
                else if(this.current_weight > 66) {
                    require = this.current_weight - 66;
                    System.out.println("Your current Weight is " + this.current_weight + ". You need to loose" + require);
                }
                break;

        }
    }
    //user input and set the data
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        // Get name input
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        //for validation string not including @/-/_..
        while (name.matches(".*[@_\\-].*")) {
            System.out.println("\033[31m" + "Invalid input" + "\033[0m");
           name = scanner.nextLine();
        }

        //set the input name
        setName(name);

        //current weight
        System.out.println("Enter your Current Weight:");
        int currentWeight = scanner.nextInt();
        scanner.nextLine();
        setCurrentWeight(currentWeight);

        //competition weight
        System.out.println("Choose your Competition weight category");
        System.out.println("**********************************************************************");
        System.out.println("Heavy Weight               " + "Unlimited(over 100)");
        System.out.println("Light-Heavyweight               " + "100 t0 90");
        System.out.println("Middleweight                     " + "90 to 81");
        System.out.println("Light-Middleweight               " + "81 to 73");
        System.out.println("Lightweight              " + "73 to 66");
        System.out.println("Flyweight               " + "less than 66");

        String category = scanner.nextLine();
        setCompetitionWeightCategory(category);
        this.compareCompetitionandWeight();

        System.out.println("Choose Training plan and cost for each  training plan is weekly");
        System.out.println("**********************************************************************");
        System.out.println("Beginner (2 sessions per week)         " + " $25.00");
        System.out.println("Intermediate (3 sessions per week)         " + " $30.00");
        System.out.println("Elite (5 sessions per week)         " + " $35.00");
        System.out.println("the cost for each  training plan is weekly");
        System.out.println("************************************************************************");

        String plan = scanner.nextLine();
        setTrainingPlan(plan);



        System.out.println("Would u like to add the number of hours private coaching?");
        String doPrivate= scanner.nextLine();
        System.out.println(doPrivate);
        //userInput is yes
        if (doPrivate.equals("yes")) {
            System.out.println("the cost of private tuition for 1 hour is $9.00 and u can get 5 time maximum at Week");
            System.out.println("Please add the number of hours of private coaching.");

            int privateCoaching = scanner.nextInt();
            //validation that privateCoaching is not equal and allow only 5
            while (privateCoaching <= 1 || privateCoaching > 5){
                //user add more than 5 that will show
                if(privateCoaching >5) {
                    System.out.println("\033[31m" + "u can't add more than 5" + "\033[0m");
                }
                //user add 0 that will show
                if(privateCoaching == 0){
                    System.out.println("\033[31m" + "Invalid input" + "\033[0m");
                }
                 privateCoaching = scanner.nextInt();
            }
            //to next line
            scanner.nextLine();
            setTotalPrivateCoaching(privateCoaching);
        } else {
            //if user input will no
            setTotalPrivateCoaching(0);
        }

        //training plan is not beginner that condition will work
        if(!training_plan.equals("beginner")){
            System.out.println("the cost of a competition is $22.0 and Competition are held on only second saturday of month");
            System.out.println("Please add the total number of competitions");
            int totalCompetitions = scanner.nextInt();
            // validation that user can't add 0
            while (totalCompetitions < 1){


                    System.out.println("\033[31m" + "Invalid input" + "\033[0m");

                totalCompetitions = scanner.nextInt();
            }
            setTotalCompetitions(totalCompetitions);
        }
    }

}
