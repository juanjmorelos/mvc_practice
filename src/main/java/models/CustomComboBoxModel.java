/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import java.util.ArrayList;

public class CustomComboBoxModel extends AbstractListModel<PositionModel> implements ComboBoxModel<PositionModel> {
    
    private ArrayList<PositionModel> array;
    private PositionModel selectedPosition;

    public CustomComboBoxModel(ArrayList<PositionModel> array) {
        this.array = array;
        PositionModel verTodos = new PositionModel();
        verTodos.setPositionId("-1");
        verTodos.setPositionName("Ver todos");
        this.array.add(0, verTodos);
        selectedPosition = verTodos;
    }

    @Override
    public int getSize() {
        return array.size();
    }

     @Override
    public PositionModel getElementAt(int index) {
        return array.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedPosition = (PositionModel) anItem;
    }

    @Override
    public PositionModel getSelectedItem() {
        return selectedPosition;
    }
    
}
