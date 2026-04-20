package edu.ksu.swe2026.service;

import edu.ksu.swe2026.model.Expense;
import edu.ksu.swe2026.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();
    private User user = new User();
    private Long idCounter = 1L;

    public Expense addExpense(double amount, String category) {
        Expense expense = new Expense(idCounter++, amount, category);
        expenses.add(expense);

        if (amount < 50) {
            user.addPoints(10);
        }

        return expense;
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public int getUserPoints() {
        return user.getPoints();
    }
}