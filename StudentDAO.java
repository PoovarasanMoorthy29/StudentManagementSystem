package StudentManagementSystem;

import java.sql.*;

public class StudentDAO {

    public  void Add(Student s){

        String query="insert into student values(?,?,?,?)";
        try{
            Connection connect=DbConnection.getConnect();
            PreparedStatement pst=connect.prepareStatement(query);

            pst.setInt(1,s.getId());
            pst.setString(2,s.getName());
            pst.setInt(3,s.getAge());
            pst.setString(4,s.getGrade());

            pst.executeUpdate();

            System.out.println("Student added");
            connect.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id,String newName,int newAge,String newGrade){

        String query="update student set name=?, age=?,grade=? where id=?";
        try{
            Connection connect=DbConnection.getConnect();
            PreparedStatement pst= connect.prepareStatement(query);

            pst.setString(1,newName);
            pst.setInt(2,newAge);
            pst.setString(3,newGrade);
            pst.setInt(4,id);

            pst.executeUpdate();

            System.out.println("Updated");
            connect.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void viewAll(){

        String query="Select * from student";
        try{
            Connection connect= DbConnection.getConnect();
            Statement st= connect.createStatement();
            ResultSet result=st.executeQuery(query);

            int studentCount=0;

            while(result.next()){
                System.out.println(
                         "Student ID: "+result.getInt("id")+"\n"
                        +"Student Name: "+result.getString("name")+"\n"
                        +"Student Age: "+result.getInt("age")+"\n"
                        +"Student Grade: "+result.getString("grade")+"\n");
                studentCount++;
            }
            System.out.println("Total Student count is :"+studentCount);
            st.close();
            result.close();
            connect.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id){

        String query="delete from student where id=?";
        try{
            Connection connect=DbConnection.getConnect();
            PreparedStatement pst=connect.prepareStatement(query);
            pst.setInt(1,id);

            pst.executeUpdate();

            System.out.println("Record Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
