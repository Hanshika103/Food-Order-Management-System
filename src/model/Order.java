

package model;

import java.util.Date;
import java.util.List;

public class Order {

    private int orderId;
    private int studentId;
    private Date orderDate;
    private double totalAmount;
    private String status;

    private List<Item> itemsList; // 🔥 important

    // ==============================
    // Constructor for placing order
    // ==============================
    public Order(int studentId, Date orderDate, double totalAmount, String status, List<Item> itemsList) {
        this.studentId = studentId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.itemsList = itemsList;
    }

    // ==============================
    // Constructor for fetching order
    // ==============================
    public Order(int orderId, int studentId, Date orderDate, Date orderTime, double totalAmount, String status) {
        this.orderId = orderId;
        this.studentId = studentId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // ==============================
    // Getters
    // ==============================

    public int getOrderId() {
        return orderId;
    }

    public int getStudentId() {
        return studentId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    // ==============================
    // Setters
    // ==============================

    public void setStatus(String status) {
        this.status = status;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    // ==============================
    // INNER CLASS (VERY IMPORTANT 🔥)
    // ==============================
    public static class Item {

        private int itemId;
        private int quantity;
        private double subtotal;

        public Item(int itemId, int quantity, double subtotal) {
            this.itemId = itemId;
            this.quantity = quantity;
            this.subtotal = subtotal;
        }

        public int getItemId() {
            return itemId;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getSubtotal() {
            return subtotal;
        }
       
    }
    
}