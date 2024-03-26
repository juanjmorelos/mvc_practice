/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.PositionModel;
import models.UserModel;

/**
 *
 * @author juan.morelos
 */
public class SQLController {
    private final String dbUser = "root";
    private final String dbPassword = "";
    private final String dbName = "employee_database";
    private final String dbUrl = "jdbc:mysql://localhost/" + dbName;
    private Connection connection;
    
    private boolean connectSQL() {
        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            return true;
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.toString());
            return false;
        }
    }
    
    public ArrayList<UserModel> getAllUserList() {
        ArrayList<UserModel> userArray = new ArrayList<>();
        try {
            if(connectSQL()) {
                PreparedStatement preparesStatement = connection.prepareStatement("SELECT u.userName, u.userLastName, p.postitionName FROM `user_information` u INNER JOIN `position` p ON u.positionId = p.positionId");
                ResultSet resultSet = preparesStatement.executeQuery();
                
                while(resultSet.next()) {
                    UserModel user = new UserModel();
                    user.setName(resultSet.getString("userName"));
                    user.setLastName(resultSet.getString("userLastName"));
                    user.setPositionName(resultSet.getString("postitionName"));
                    userArray.add(user);
                }
                return userArray;
            } else {
                return userArray;
            }
        } catch (SQLException e) {
            System.out.println("Unespected Error: " + e.toString());
            return new ArrayList<>();
        }
    }
    
    public ArrayList<UserModel> getAllUserListByPosition(int position) {
        ArrayList<UserModel> userArray = new ArrayList<>();
        try {
            if(connectSQL()) {
                PreparedStatement preparesStatement = connection.prepareStatement("SELECT u.userName, u.userLastName, p.postitionName FROM `user_information` u INNER JOIN `position` p ON u.positionId = p.positionId WHERE u.positionId = " + position);
                ResultSet resultSet = preparesStatement.executeQuery();
                
                while(resultSet.next()) {
                    UserModel user = new UserModel();
                    user.setName(resultSet.getString("userName"));
                    user.setLastName(resultSet.getString("userLastName"));
                    user.setPositionName(resultSet.getString("postitionName"));
                    userArray.add(user);
                }
                return userArray;
            } else {
                return userArray;
            }
        } catch (SQLException e) {
            System.out.println("Unespected Error: " + e.toString());
            return new ArrayList<>();
        }
    }
    
    public ArrayList<PositionModel> getAllPositions() {
        ArrayList<PositionModel> positionArray = new ArrayList<>();
        try {
            if(connectSQL()) {
                PreparedStatement preparesStatement = connection.prepareStatement("SELECT * FROM `position`");
                ResultSet resultSet = preparesStatement.executeQuery();
                
                while(resultSet.next()) {
                    PositionModel position = new PositionModel();
                    position.setPositionId(resultSet.getString("positionId"));
                    position.setPositionName(resultSet.getString("postitionName"));
                    positionArray.add(position);
                }
                return positionArray;
            } else {
                return positionArray;
            }
        } catch (SQLException e) {
            System.out.println("Unespected Error: " + e.toString());
            return new ArrayList<>();
        }
    }
}
