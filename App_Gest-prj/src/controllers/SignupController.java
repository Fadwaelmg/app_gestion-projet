package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SignupController<JFXTextArea, JFXButton> implements Initializable{
	@FXML
    private JFXTextArea password_2;

    @FXML
    private JFXTextArea password;

    @FXML
    private JFXTextArea prenom;

    @FXML
    private JFXTextArea nom_utilisateur;

    @FXML
    private JFXTextArea nom;

    @FXML
    private JFXTextArea tele;

    @FXML
    private JFXTextArea email;

    @FXML
    private JFXButton btn_inscrire;
    
    @FXML
    private JFXButton btn_roteur;

    @FXML
    void open_login() {

    }
    
    @FXML
    void Rotuer() {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
