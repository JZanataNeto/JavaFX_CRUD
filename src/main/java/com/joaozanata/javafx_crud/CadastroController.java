package com.joaozanata.javafx_crud;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController {
    @FXML
    TextField nameField;
    @FXML
    TextField emailField;
    @FXML
    private Label labelBoasVindas;
    @FXML
    private Label labelNivelAcesso;
    @FXML
    Button btnCriar;
    @FXML
    Button btnConsultar;
    @FXML
    Button btnAtualizar;
    @FXML
    Button btnExcluir;
    @FXML
    Button btnSair;

    public void inicializarUsuario(Usuario usuarioLogado) {
        labelBoasVindas.setText("Olá, " + usuarioLogado.getNome() + "!");
        labelNivelAcesso.setText("Senha: " + usuarioLogado.getSenha());
    }

}
