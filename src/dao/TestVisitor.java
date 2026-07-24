package dao;

import model.Visitor;

public class TestVisitor {

    public static void main(String[] args) {

        Visitor visitor = new Visitor();

        visitor.setName("Rahul");
        visitor.setPhone("9876543210");
        visitor.setPurpose("Meeting");
        visitor.setEntryTime("2026-07-24 18:00:00");
        visitor.setExitTime("2026-07-24 19:00:00");

        VisitorDAO dao = new VisitorDAO();

        if (dao.addVisitor(visitor)) {
            System.out.println("Visitor Added!");
        } else {
            System.out.println("Failed!");
        }
    }
}