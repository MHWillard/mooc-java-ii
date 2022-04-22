package title;


import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    
    @Override
    public void start(Stage stage) {        
        Parameters params = getParameters();
        String userTitle = params.getNamed().get("add_title");
        
        stage.setTitle(userTitle);
        stage.show();
    }
    
    public static void main(String[] args) {
                CmdInterface cmd = new CmdInterface();
        String input = cmd.printCmd();
        
        UserTitle title = new UserTitle(input);
        String titleGet = title.getTitle();
        
        launch(Main.class, "--add_title="+titleGet);

    }

}
