/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import views.HomeView;

/**
 *
 * @author juan.morelos
 */
public class MainController {
    
    private HomeView view;
    
    public MainController(HomeView view) {
        this.view = view;
    }
    
    public void initMainView() {
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Empleados");
    }
    
}
