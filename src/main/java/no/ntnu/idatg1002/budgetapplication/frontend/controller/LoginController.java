package no.ntnu.idatg1002.budgetapplication.frontend.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

  @FXML // ResourceBundle that was given to the FXMLLoader
  private ResourceBundle resources;

  @FXML // URL location of the FXML file that was given to the FXMLLoader
  private URL location;

  @FXML // fx:id="budgetApplicationText"
  private Text budgetApplicationText; // Value injected by FXMLLoader
  @FXML // fx:id="loginOrRegisterText"
  private Text loginOrRegisterText; // Value injected by FXMLLoader
  @FXML // fx:id="pinCodeText"
  private Text pinCodeText; // Value injected by FXMLLoader
  @FXML // fx:id="usernameText"
  private Text usernameText; // Value injected by FXMLLoader

  @FXML // fx:id="pinCodeTextField"
  private TextField pinCodeTextField; // Value injected by FXMLLoader
  @FXML // fx:id="usernameTextField"
  private TextField usernameTextField; // Value injected by FXMLLoader

  @FXML // fx:id="forgotPinCodeHyperlink"
  private Hyperlink forgotPinCodeHyperlink; // Value injected by FXMLLoader

  @FXML // fx:id="loginButton"
  private Button loginButton; // Value injected by FXMLLoader
  @FXML // fx:id="registerNewAccountButton"
  private Button registerNewAccountButton; // Value injected by FXMLLoader

  @FXML
  void forgotPinCode(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(
            Objects.requireNonNull(
                getClass().getResource("/fxmlfiles/resetPinCodeEnterUser.fxml")));
    String css =
        Objects.requireNonNull(this.getClass().getResource("/cssfiles/primary.css"))
            .toExternalForm();
    Scene scene = ((Node) event.getSource()).getScene();
    scene.getStylesheets().add(css);
    scene.setRoot(root);
  }

  @FXML
  void loginAccount(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxmlfiles/primary.fxml")));
    String css =
        Objects.requireNonNull(this.getClass().getResource("/cssfiles/primary.css"))
            .toExternalForm();
    Scene scene = ((Node) event.getSource()).getScene();
    scene.getStylesheets().add(css);
    scene.setRoot(root);
  }

  @FXML
  void registerNewAccount(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(
            Objects.requireNonNull(getClass().getResource("/fxmlfiles/registerNewAccount.fxml")));
    String css =
        Objects.requireNonNull(this.getClass().getResource("/cssfiles/primary.css"))
            .toExternalForm();
    Scene scene = ((Node) event.getSource()).getScene();
    scene.getStylesheets().add(css);
    scene.setRoot(root);
  }

  @FXML // This method is called by the FXMLLoader when initialization is complete
  void initialize() {
    assert budgetApplicationText != null
        : "fx:id=\"budgetApplicationText\" was not injected: check your FXML file 'login.fxml'.";
    assert forgotPinCodeHyperlink != null
        : "fx:id=\"forgotPinCodeHyperlink\" was not injected: check your FXML file 'login.fxml'.";
    assert loginButton != null
        : "fx:id=\"loginButton\" was not injected: check your FXML file 'login.fxml'.";
    assert loginOrRegisterText != null
        : "fx:id=\"loginOrRegisterText\" was not injected: check your FXML file 'login.fxml'.";
    assert pinCodeText != null
        : "fx:id=\"pinCodeText\" was not injected: check your FXML file 'login.fxml'.";
    assert pinCodeTextField != null
        : "fx:id=\"pinCodeTextField\" was not injected: check your FXML file 'login.fxml'.";
    assert registerNewAccountButton != null
        : "fx:id=\"registerNewAccountButton\" was not injected: check your FXML file 'login.fxml'.";
    assert usernameText != null
        : "fx:id=\"usernameText\" was not injected: check your FXML file 'login.fxml'.";
    assert usernameTextField != null
        : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'login.fxml'.";
  }
}
