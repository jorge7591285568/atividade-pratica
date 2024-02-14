package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;


    public class CadCarroController {
        @FXML
        private TextField txModelo;
        @FXML
        private TextField txMarca;
        @FXML
        private TextField txPassageiro;
        @FXML
        private TextField txAno;
    
        @FXML
        private ChoiceBox<Carro> slCarro;
    
        @FXML
        void salvarCarro(ActionEvent event) {
            Carro novoCarro = new Carro(txModelo.getText(),
                    txMarca.getText(),
                    txPassageiro.getText(),
                    txAno.getText(),
                    slCarro.getSelectionModel().getSelectedItem());
            new Alert(AlertType.INFORMATION,
                    "Cadastrando Carro(Fake):" + novoCarro.toString()).showAndWait();
            limparTela();
    
        }
    
        @FXML 
        private void initialize() {
            slCarro.setConverter(new StringConverter<Carro>() {
                @Override
                public String toString(Carro obj) {
                    if (obj != null) {
                        return obj.getModelo() + ":" + obj.getMarca() + ":" + obj.getPassageiro() + ":" + obj.getAno();
                    }
                    return "";
                }
    
                @Override
                public Carro fromString(String stringModelo) {
                    return Carro.listaCarros;
                        .stream()
                        .filter(Carro -> stringModelo.equals(Carro.getModelo() + ":" + Carro.getMarca()))
                        .findAny()
                        .orElse(null);                
                }
            });
            
            carregarListaCarros();
        }
    
        @FXML
        private void limparTela() {
            txModelo.setText("");
            txMarca.setText("");
            txPassageiro.setText("");
            txAno.setText("");
            // Todo REVER
            slCarro.setSelectionModel(null);
        }
    
        private void carregarListaAutores() {
            slCarro.setItems(Carro.listaCarros);
        }
    
    }

