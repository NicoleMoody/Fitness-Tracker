/**
 * Created by ckappel171432 on 4/14/2017.
 */
public class myAwesomeSwitchStatement
{
    private void setWorkout (String workout, String level, String[] exerciseArray){
        switch(workout){
            case "Upper":
                switch(level){
                    case "1":
                        exerciseArray[0] = "15 push ups";
                        exerciseArray[1] = "15 pull ups";
                        break;
                    case "2":
                        exerciseArray[0] = "30 push ups";
                        exerciseArray[1] = "30 pull ups";
                        break;
                    case "3":
                        exerciseArray[0] = "45 push ups";
                        exerciseArray[1] = "45 pull ups";
                        break;
                    case "4":
                        exerciseArray[0] = "60 push ups";
                        exerciseArray[1] = "60 pull ups";
                        break;
                    case "5":
                        exerciseArray[0] = "75 push ups";
                        exerciseArray[1] = "75 pull ups";
                        break;
                    default:
                        exerciseArray[0] = "Didn't Work";
                        exerciseArray[1] = "";
                        break;
                }
                break;
            case "Lower":

                switch(level){
                    case "1":
                        exerciseArray[0] = "15 squats";
                        exerciseArray[1] = "15 lunges";
                        break;
                    case "2":
                        exerciseArray[0] = "30 squats";
                        exerciseArray[1] = "30 lunges";
                        break;
                    case "3":
                        exerciseArray[0] = "45 squats";
                        exerciseArray[1] = "45 lunges";
                        break;
                    case "4":
                        exerciseArray[0] = "60 squats";
                        exerciseArray[1] = "60 lunges";
                        break;
                    case "5":
                        exerciseArray[0] = "75 squats";
                        exerciseArray[1] = "75 lunges";
                        break;
                    default:
                        exerciseArray[0] = "Didn't Work";
                        exerciseArray[1] = "";
                        break;
                }
                break;
            case "Cardio":

                switch(level){
                    case "1":
                        exerciseArray[0] = "1 Mile Steady Jog";
                        exerciseArray[1] = "";
                        break;
                    case "2":
                        exerciseArray[0] = "2 Mile Steady Jog";
                        exerciseArray[1] = "";
                        break;
                    case "3":
                        exerciseArray[0] = "3 Mile Steady Jog";
                        exerciseArray[1] = "";
                        break;
                    case "4":
                        exerciseArray[0] = "4 Mile Steady Jog";
                        exerciseArray[1] = "";
                        break;
                    case "5":
                        exerciseArray[0] = "5 Mile Steady Jog";
                        exerciseArray[1] = "";
                        break;
                    default:
                        exerciseArray[0] = "Go run a marathon";
                        exerciseArray[1] = "";
                        break;
                }
                break;
            case "Core":

                switch(level){
                    case "1":
                        exerciseArray[0] = "20 sit ups";
                        exerciseArray[1] = "30 second plank";
                        break;
                    case "2":
                        exerciseArray[0] = "40 sit ups";
                        exerciseArray[1] = "60 second plank";
                        break;
                    case "3":
                        exerciseArray[0] = "60 sit ups";
                        exerciseArray[1] = "100 second plank";
                        break;
                    case "4":
                        exerciseArray[0] = "80 sit ups";
                        exerciseArray[1] = "150 second plank";
                        break;
                    case "5":
                        exerciseArray[0] = "100 sit ups";
                        exerciseArray[1] = "210 second plank";
                        break;
                    default:
                        exerciseArray[0] = "Didn't Work";
                        exerciseArray[1] = "";
                        break;
                }
                break;
        }
    }
}
