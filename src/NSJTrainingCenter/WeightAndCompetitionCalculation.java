package NSJTrainingCenter;

public class WeightAndCompetitionCalculation {

    //total of all plan costs
    public static float totalCosts(String data){

        switch (data){
            case "beginner":
                float result = (float) 25 * 4;
                return result;
            case "intermediate":
                float result1 = (float) 30 * 4;
                return result1;
            default:
                float result2 = (float) 35 * 4;
                return result2;
        }
    }

    //total sessions
    public static int totalSessions(String data){

        switch (data){
            case "beginner":
                int result =  2 * 4;
                return result;
            case "intermediate":
                int result1 =  3 * 4;
                return result1;
            default:
                int result2 =  5 * 4;
                return result2;
        }
    }

    //total Private costs
    public static float totalPrivateCost(int data){
        float result1 = (float) data * 9;
        return result1;
    }

    // total competitions
    public static float totalCompetitionCost(int data){
        float result1 = (float) data * 22;
        return result1;
    }


}
