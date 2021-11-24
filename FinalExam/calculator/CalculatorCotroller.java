package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculatorCotroller {
    @FXML
    private Text screen;
    @FXML
    private String screenOutPut = "";
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("js");
    private Object outcome;

//    button controller function/method
    @FXML
    private void btnController(ActionEvent event) throws ScriptException {
        String input = (((Button) event.getSource()).getText());
//        displaying the input that contains the following characters
        if ("1234567890+-*/.".contains(input)) screenOutPut += input;

//        for canceling button
        else if (input.equals("C")){
            screenOutPut = "";
        }

        else if (input.equals("Delete")) {
            screenOutPut = "";
        }
//        condition for - and % button
        else {
            outcome = engine.eval(screenOutPut);
            if (input.equals("+/-")) outcome = Double.parseDouble(outcome.toString()) * -1;
            else if (input.equals("%")) outcome = Double.parseDouble(outcome.toString()) / 100;
            screenOutPut = outcome.toString();
        }
        screen.setText(screenOutPut);
    }
}
