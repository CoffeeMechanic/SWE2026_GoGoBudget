package edu.ksu.swe2026.model;

public class Expense
{
    private Long id;
    private double amount;
    private String category;

    public Expense(Long id, double amount, String category) {
        this.id = id;
        this.amount = amount;
        this.category = category;
    }

    public Long getId() { return id; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
}