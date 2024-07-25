package Employee;

import java.sql.*;

public class EmployeeImp implements Emplloyeeinterf {


    @Override
    public  void createEmployee(Employee employee) {
        Connection con = DBConnection.createDBConnection("emp");
        String query = "insert into employee value (?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, 12);
            pstm.setString(2, "Ayyappa");
            pstm.setInt(3, 45000);
            pstm.setInt(4, 40);
            pstm.setString(5, "USA");
            int cnt = pstm.executeUpdate();

            if (cnt != 0) {
                System.out.println("Employee Inserted Successfully");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void showAllEmployee() {
        Connection con = DBConnection.createDBConnection("emp");
        String query = "select * from Employee";
        System.out.println("Employee details :");
        System.out.format("%s\t%s\t%s\t%s\t%s\n", "ID", "Name", "Salary", "age", "location");
        try {
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                System.out.format("%s\t%s\t%s\t%s\n",
                        resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getString(5));
                System.out.println("-------------------------------");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void showEmployeebasedonId() {

    }


    @Override
    public void updateEmployee(int id, String name) {


        Connection con = DBConnection.createDBConnection("emp");
        String query = "update Employee set name=? where id=? ";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            int cnt = pstmt.executeUpdate();
            if (cnt != 0) {
                System.out.println("Employee updated details");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }


    @Override
    public void showEmployeebasedonId(int Employeeid) {
        Connection con = DBConnection.createDBConnection("emp");
        String query = "select * from Employee where id =" + Employeeid;
        try {
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            while (resultSet.next()) {
                System.out.format("%s\t%s\t%s\t%s\n",
                        resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getString(5));
                System.out.println("-------------------------------");
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void deleteEmployee(int id, String location) {

        Connection con = DBConnection.createDBConnection("emp");
        String query = "delete from Employee where id=?";
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, location);
            int cnt = pstmt.executeUpdate();
            if (cnt != 0) {
                System.out.println("Employee deleted");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static  void main(String agr[]) {
        EmployeeImp employee = new EmployeeImp();

        employee.createEmployee(null);
        employee.showAllEmployee();
        employee.showEmployeebasedonId(12);
        employee.updateEmployee(12,"Ayyappa");




    }
}








