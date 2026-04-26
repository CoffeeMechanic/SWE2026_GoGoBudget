package edu.ksu.swe2026.model;

public class Expense
{
    private Long id;
    private double amount;
    private String category;
    private String date;

    public Expense(Long id, double amount, String category, String date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }
    //Getters
    public Long getId() { return id; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDate() {return date;}
    //Setters
    public void setId(Long id) {this.id = id;}
    public void setAmount(double amount) {this.amount = amount;}
    public void setCategory(String category) {this.category = category;}
    public void setDate(String date){this.date = date;}
}