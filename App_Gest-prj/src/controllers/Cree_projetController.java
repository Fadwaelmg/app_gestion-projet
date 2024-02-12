package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextFlow;

public class Cree_projetController<JFXButton> implements Initializable{
	
	   @FXML
	    private Pane pan;
	
	  @FXML
	    private TextFlow nom_projet;

	    @FXML
	    private JFXButton btn_liste_tache;

	    @FXML
	    private JFXButton btn_information;

	    @FXML
	    private TextFlow nb_tache;

	    @FXML
	    private TextFlow por_tache;

	    @FXML
	    private JFXButton btn_roteur;

	    @FXML
	    void Rotuer() {

	    }

	    @FXML
	    void open_information() {

	    }

	    @FXML
	    void open_liste_tache() {

	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			
			
		}

}
