package dao;

import db.DBConnection;
import model.Visitor;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VisitorDAO {

    public boolean addVisitor(Visitor visitor) {

        String sql = "INSERT INTO visitors(name, phone, purpose, entry_time, exit_time) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, visitor.getName());
            ps.setString(2, visitor.getPhone());
            ps.setString(3, visitor.getPurpose());
            ps.setString(4, visitor.getEntryTime());
            ps.setString(5, visitor.getExitTime());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}