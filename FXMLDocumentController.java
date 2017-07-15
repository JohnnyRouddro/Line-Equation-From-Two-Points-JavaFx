import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    int x1,y1,x2,y2;
    
    @FXML private Label label;
    @FXML private TextField x1input;
    @FXML private TextField y1input;
    @FXML private TextField x2input;
    @FXML private TextField y2input;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try{
            x1 = Integer.parseInt(x1input.getText());
            y1 = Integer.parseInt(y1input.getText());
            x2 = Integer.parseInt(x2input.getText());
            y2 = Integer.parseInt(y2input.getText());
            LineEquation line = new LineEquation();
            label.setText(line.getEq(x1,y1,x2,y2));
        }catch(Exception e){
            label.setText("error !");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
