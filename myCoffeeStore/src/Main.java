import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    static void myProducts(){
        System.out.println("Prices:");
        System.out.println("Bubblegum: $2");
        System.out.println("Toffee: $0.2");
        System.out.println("Ice cream: $5");
        System.out.println("Milk chocolate: $4");
        System.out.println("Doughnut: $2.5");
        System.out.println("Pancake: $3.2");
        System.out.println();
    }
    static void Earn(){
        System.out.println("Earnd amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println();
        System.out.println("Income: $5405.0");
        System.out.println();
    }
    static void inquire(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses=scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses=scanner.nextInt();
        int netIncome=5404-staffExpenses-otherExpenses;
        System.out.println("Net income : $"+netIncome);
    }

    public static void main(String[] args) {
        myProducts();
        Earn();
        inquire();
    }
}