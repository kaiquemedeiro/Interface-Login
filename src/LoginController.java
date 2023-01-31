import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaologin;

    @FXML
    private TextField camposenha;

    @FXML
    private TextField campousuario;

    @FXML
    private Label lblMensagem;

    @FXML
    private Label lblMensagem1;

    @FXML
    private Label lblMensagem11;

    @FXML
    void fazerlogin(ActionEvent event) {
        String usuario = campousuario.getText();
        String senha = camposenha.getText();

        if ((usuario.equals("kaiquemedeiro")) && (senha.equals("1234"))) {

            System.out.println("LOGIN REALIZADO COM SUCESSO!");
        } else {
            System.out.println("ERROR LOGIN");
        }
        }


    }


