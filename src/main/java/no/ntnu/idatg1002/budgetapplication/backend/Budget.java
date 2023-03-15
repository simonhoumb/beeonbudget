package no.ntnu.idatg1002.budgetapplication.backend;

import java.util.ArrayList;
import java.util.List;

/**
 * Budget is a class that contains a list of expenses, a list of incomes, and a list of categories
 */
public class Budget {

    private String budgetName;
    private List<Expense> expenseList;
    private List<Income> incomeList;
    private List<Enum> categoryList;

    public Budget(String budgetName){
        this.budgetName = budgetName;
        incomeList = new ArrayList<>();
        expenseList = new ArrayList<>();
        categoryList = new ArrayList<>();
    }

    /**
     * This function returns the name of the budget
     *
     * @return The budget name.
     */
    public String getBudgetName()
    {
        return budgetName;
    }

    /**
     * This function sets the budget name
     *
     * @param budgetName The name of the budget you want to create.
     */
    public void setBudgetName(String budgetName)
    {
        this.budgetName = budgetName;
    }

    /**
     * Get the total income by adding up all the income objects in the incomeList.
     *
     * @return The total income of the user.
     */

    public int getTotalIncome(){
        int totalIncome = 0;
        for (Income income: incomeList)
        {
            totalIncome += income.getTotal();
        }
        return totalIncome;
    }

    /**
     * This function returns the total expense of all the expenses in the expense list
     *
     * @return The total expense of the trip.
     */

    public int getTotalExpense(){
        int totalExpense = 0;
        for (Expense expense: expenseList)
        {
            totalExpense += expense.getTotal();
        }
        return totalExpense;
    }

    /**
     * This function returns the difference between the total income and the total expense
     *
     * @return The difference between the total income and the total expense.
     */
    public int getNetBalance(){
       return getTotalIncome() - getTotalExpense();
    }

    public void addBudgetCategories(){
        categoryList.add(Enum);
    }


    /**
     * This function adds an expense to the expense list
     *
     * @param expense The expense object that you want to add to the list.
     */
    public void addBudgetExpenses(Expense expense){
        expenseList.add(expense);
    }

    /**
     * This function adds an income to the incomeList
     *
     * @param income The income object to be added to the list.
     */
    public void addBudgetIncome(Income income){
        incomeList.add(income);
    }

    /**
     * > This function returns the incomeList
     *
     * @return A list of income objects.
     */
    public List<Income> getIncomeList()
    {
        return incomeList;
    }

    /**
     * This function returns the expenseList.
     *
     * @return A list of expenses.
     */
    public List<Expense> getExpenseList()
    {
        return expenseList;
    }

    /**
     * > This function returns a list of categories
     *
     * @return A list of Enum objects.
     */
    public List<Enum> getCategoryList()
    {
        return categoryList;
    }
}
