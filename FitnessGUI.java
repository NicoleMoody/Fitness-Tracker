package Fitness;

import javafx.application.Application;

/**
 * Created by nmoody163104 on 4/24/2017.
 */
public class FitnessGUI extends Application {
    private void ButtonClicked(ActionEvent e)
{
    if (e.getSource()==btnscene1)
        thestage.setScene(scene2);
    else
        thestage.setScene(scene1);
}
    private String setLevel(String level){
        level = "Level: " + level;

        return level;
    }
    private String setArea(String area) {
        switch (userChoice) {
            case "Upper":
            case "Lower":
                area += " Body Workout";
                break;
            case "Cardio":
            case "Core":
                area += " Workout";
                break;
            default:
                area += "Something ain't right";
                break;
        }

        return area;
    }
    private void setImage(String area, String[] imageArray){
        switch (area){
            case "Upper":
                imageArray[0] = "https://yurielkaim.com/wp-content/uploads/2013/07/Advanced-Push-up-Variations-Traditional-Push-up.jpg";
                imageArray[1] = "http://cdn-mf0.heartyhosting.com/sites/mensfitness.com/files/rookie-mistakes-the-pullup-main.jpg";
                break;
            case "Lower":
                imageArray[0] = "http://t2conline.com/wp-content/uploads/2017/01/correct-squat-tips.jpg";
                imageArray[1] = "http://3i133rqau023qjc1k3txdvr1.wpengine.netdna-cdn.com/wp-content/uploads/2014/08/Alternating-Forward-Lunges_Exercise.jpg";
                break;
            case "Cardio":
                imageArray[0] = "https://media.tenor.co/images/7c055ab2ba5746039696b98bae0953ed/tenor.gif";
                imageArray[1] = "https://everydaylisamae.files.wordpress.com/2015/02/running.jpg";
                break;
            case "Core":
                imageArray[0] = "http://68.media.tumblr.com/586bae1d9492345315b7a066c69287cb/tumblr_inline_mx42q8LFnF1rdu2za.jpg";
                imageArray[1] = "http://img.webmd.com/dtmcms/live/webmd/consumer_assets/site_images/articles/health_tools/diabetes_strength_training_slideshow/getty_rm_photo_of_woman_doing_plank.jpg";
                break;
            default:
                imageArray[0] = "http://www.womenshealthmag.com/sites/womenshealthmag.com/files/styles/slideshow-desktop/public/images/slide2-bweight-squat.jpg?itok=nGvYxHiX";
                imageArray[1] = "http://www.womenshealthmag.com/sites/womenshealthmag.com/files/styles/slideshow-desktop/public/images/slide8dbell-split-squat.jpg?itok=5Ic6dU_-";
                break;
        }

    }
}
