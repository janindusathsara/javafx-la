package lk.ijse.javafxla.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lk.ijse.javafxla.dto.ItemDto;
import lk.ijse.javafxla.service.ServiceFactory;
import lk.ijse.javafxla.service.ServiceType;
import lk.ijse.javafxla.service.custom.ItemService;

import java.sql.SQLException;

public class ItemFormController {
    @FXML
    private ComboBox<?> cmbSuppId;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colcode;

    @FXML
    private TableColumn<?, ?> colqtyonhand;

    @FXML
    private TableColumn<?, ?> coluniteprice;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblitem;

    @FXML
    private TextField txtSupShop;

    @FXML
    private TextField txtSupTel;

    @FXML
    private TextField txtSuppName;

    @FXML
    private TextField txtcode;

    @FXML
    private TextField txtdescription;

    @FXML
    private TextField txtqtyonhand;

    @FXML
    private TextField txtuniteprice;

    private ItemService itemService = ServiceFactory.getService(ServiceType.ITEM);

    public void initialize() throws SQLException {
        System.out.println("Item Form Just Loaded!");

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String code = txtcode.getText();
        String description = txtdescription.getText();
        double unitPrice = Double.parseDouble(txtuniteprice.getText());
        int qtyOnHand = Integer.parseInt(txtqtyonhand.getText());

        var itemDto = new ItemDto(code, description, unitPrice, qtyOnHand);

        try {
            boolean isSaved = itemService.saveItem(itemDto);
            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "item saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

    @FXML
    void btnBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void cmbSupplierIdOnAction(ActionEvent event) {

    }

    @FXML
    void txtItemCodeOnAction(ActionEvent event) {

    }
}
