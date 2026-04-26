package edu.ksu.swe2026.controller;

import edu.ksu.swe2026.model.Expense;
import edu.ksu.swe2026.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestParam double amount,
                              @RequestParam String category,
                              @RequestParam String date) {
        return service.addExpense(amount, category, date);
    }

    @GetMapping
    public List<Expense> getExpenses() {
        return service.getAllExpenses();
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @RequestParam double amount,
                                 @RequestParam String category,
                                 @RequestParam String date) {
        return service.updateExpense(id, amount, category, date);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }

    @GetMapping("/points")
    public int getPoints() {
        return service.getUserPoints();
    }
    @GetMapping("/total")
public double getTotalExpenses() {
    return service.getTotalExpenses();
}
}
