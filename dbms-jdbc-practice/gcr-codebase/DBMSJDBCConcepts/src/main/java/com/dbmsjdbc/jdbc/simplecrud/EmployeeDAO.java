package com.dbmsjdbc.jdbc.simplecrud;

import java.sql.*;

public class EmployeeDAO {

    //Add Employee
    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employee(name, department, salary) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();

            System.out.println("Employee Added Successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //View All Employees
    public void viewAllEmployees() {

        String sql = "SELECT * FROM employee";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +rs.getString("name") + " | " +rs.getString("department") + " | " +rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Update Salary
    public void updateSalary(int id, double newSalary) {

        String sql = "UPDATE employee SET salary = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, newSalary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Salary Updated Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employee WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Search Employee by Name
    public void searchEmployeeByName(String name) {

        String sql = "SELECT * FROM employee WHERE name LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +rs.getString("name") + " | " +rs.getString("department") + " | " +rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
