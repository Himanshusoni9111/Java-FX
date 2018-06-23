package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Main.*;
//import com.sun.java.swing.plaf.windows.resources.windows;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;


import java.io.IOException;
import java.lang.Exception;

import static sample.Main.windows;
public class BillPageCont {
    public static Stage BillPage;
    //table Elements
    public TableView<Product> table;
    public TableColumn<Product,String> MealColumn,Extracolumn,Itemcolumn;
    public TableColumn<Product,Double> AmmountColumn,QtyColumn;
    public TextField customernameid, mobileid,Orderid, mealid,quantityid,extraitemid,ammount;

    public  CheckBox checkid;
    public Button Addbuttonid,DeleteButton;


    public void CustomernameEnter()
    {
     customernameid = new TextField();


    }

    public void MoblieNoClicked()
    {
        mobileid = new TextField();
    }

    public void OrderEntered()
    {
       Orderid = new TextField();

    }

    public void AddButtonClicked()
    {
        Product product = new Product();
        product.setMeal(mealid.getText());
      /*  try {
            product.setAmmount(Double.parseDouble(ammount.getText()));
        }
        catch (Exception n)
        {
            System.out.println("Wrong input");
        }
        */
        try {
            product.setQuantity(Double.parseDouble(quantityid.getText()));
        }
        catch (Exception n)
        {
            System.out.println("Wrong quantity input");
        }
        product.setExtraMeal(extraitemid.getText());

        table.getItems().add(product);
        mealid.clear();
        //ammount.clear();
        extraitemid.clear();
        quantityid.clear();

    }
/*
    public ObservableList<Product> getproduct()
    {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("burger","fries",40.0,40.0));
        return products;
    }
    */
    public void PrintButtonClicked() {

    }

    public void TotalButtonClicked() {

    }

    public void NewButtonClicked() {

    }

    public void TotalTextEntered() {

    }
}


