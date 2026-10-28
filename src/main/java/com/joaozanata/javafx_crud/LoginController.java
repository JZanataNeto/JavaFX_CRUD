package com.joaozanata.javafx_crud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label loginText;
    @FXML
    private TextField campoNome;
    @FXML
    private PasswordField campoSenha;
    @FXML
    private Button btnEntrar;

    @FXML
    public void handleBotaoEntrar(javafx.event.ActionEvent actionEvent) {
        String usuario = campoNome.getText().trim();
        String senha = campoSenha.getText();

        if (usuario.isEmpty() || senha.isEmpty()) {
            exibirAlerta(Alert.AlertType.WARNING, "Campos Obrigatórios", "Por favor, preencha o usuário e a senha.");
            return;
        }

        if (usuario.equals("admin") && senha.equals("1234")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("tela_cadastro.fxml"));
                Parent root = loader.load();
                CadastroController controller = loader.getController();
                Usuario usuarioLogado = new Usuario(usuario,senha);
                controller.inicializarUsuario(usuarioLogado);
                Scene cenaCadastro = new Scene(root);
                Stage janelaAtual = (Stage) campoNome.getScene().getWindow();
                janelaAtual.setScene(cenaCadastro);
                janelaAtual.setTitle("Cadastro");
                janelaAtual.centerOnScreen();
                janelaAtual.show();

            } catch (IOException e) {
                e.printStackTrace();
                exibirAlerta(Alert.AlertType.ERROR, "Erro", "Não foi possível carregar a tela principal.");
            }
        }
    }
    private void exibirAlerta (Alert.AlertType tipo, String titulo, String mensagem){
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}
