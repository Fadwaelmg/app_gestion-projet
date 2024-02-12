package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class Nv_projetController<JFXButton, JFXDatePicker> implements Initializable{
	@FXML
    private TextField nom_projet;

    @FXML
    private TextField nb_tache;

    @FXML
    private TextField nb_personne;

    @FXML
    private JFXDatePicker date_debut;

    @FXML
    private JFXButton btn_cree;

    @FXML
    private JFXButton btn_annul;

    @FXML
    private JFXDatePicker date_fin;

    @FXML
    void open_Cree_projet() {

    }

    @FXML
    void open_accueil() {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
}
