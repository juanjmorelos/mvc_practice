/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uniminuto.employee_mvc_exercise;

import controller.MainController;
import views.HomeView;

/**
 *
 * @author juan.morelos
 */
public class EmployeeMVCExercise {

    public static void main(String[] args) {
        HomeView homView = new HomeView();
        
        MainController mainController = new MainController(homView);
        mainController.initMainView();
    }
}
