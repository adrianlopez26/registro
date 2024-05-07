package com.empresa.registro;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class UserController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private CheckBox privacyCheckBox;

    @FXML
    private Label registrationMessage;

    public void registerUser() {
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        LocalDate date = datePicker.getValue();
        boolean privacyAccepted = privacyCheckBox.isSelected();

        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || date == null || !privacyAccepted) {
            registrationMessage.setText("Por favor, completa todos los campos y acepta la política de privacidad.");
        } else if (!password.equals(confirmPassword)) {
            registrationMessage.setText("Las contraseñas no coinciden.");
        } else {
            registrationMessage.setText("Usuario registrado.");
            // Aquí puedes agregar código para almacenar el usuario en una base de datos
        }
    }
}