package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class Liste_tacheController<JFXButton, JFXDatePicker> implements Initializable{
	 @FXML
	    private TextField nom_tache;

	    @FXML
	    private JFXDatePicker date_debut;

	    @FXML
	    private JFXDatePicker date_fin;

	    @FXML
	    private TextField description;

	    @FXML
	    private JFXButton btn_ajouter;

	    @FXML
	    private JFXButton btn_annul;

	    @FXML
	    private JFXButton btn_modifier;

	    @FXML
	    private TableView<?> table;

	    @FXML
	    private TableColumn<?, ?> col_nom;

	    @FXML
	    private TableColumn<?, ?> col_debut;

	    @FXML
	    private TableColumn<?, ?> col_fin;

	    @FXML
	    private TableColumn<?, ?> col_description;

	    @FXML
	    private TableColumn<?, ?> por1;

	    @FXML
	    private TableColumn<?, ?> por2;

	    @FXML
	    private TableColumn<?, ?> por3;

	    @FXML
	    private TableColumn<?, ?> por4;

	    @FXML
	    private JFXButton btn_calcule;

	    @FXML
	    private TextFlow por_total;

	    @FXML
	    private JFXButton btn_roteur;

	    @FXML
	    void Rotuer() {

	    }

	    @FXML
	    void ajouter() {

	    }

	    @FXML
	    void annuler() {

	    }

	    @FXML
	    void calcule() {

	    }

	    @FXML
	    void modifier() {

	    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
