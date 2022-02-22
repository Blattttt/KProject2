package sample;

import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest extends Main {

    @Test
    void setOnAction() {
        TextField One = new TextField("1");

        setOnAction();

        assertEquals("2", One.getText());
    }
}