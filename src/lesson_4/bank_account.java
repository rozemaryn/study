package lesson_4;

public class bank_account {
    int id;
    String name;
    double balance;

    void AddingFunds(double a){
        balance+=a;
        System.out.println(balance);
    }

    double ReducingFunds (double a){
        double result = balance - a;
        return result; // вот это не совсем верный способ, пч для отображения результатов мне нужно затем вводить ещё одну
        // переменную, snyatie. Это логично, потому что я тут указываю, что должен отображаться result, а не balance. Т.е.
        //  с самим балансом при таком методе ничего не происходит, я ввожу новую переменную, которая использует его значение
    }
}

class bank_account_test {
    public static void main(String[] args) {
        bank_account my_account = new bank_account();
        bank_account kyt_account = new bank_account();
        bank_account kisa_alisa_account = new bank_account();

        kyt_account.id = 2;
        kyt_account.name = "Dmitriy";
        kyt_account.balance = 7_879_000;

        kisa_alisa_account.id = 3;
        kisa_alisa_account.name = "Alisa";
        kisa_alisa_account.balance = 565_083;

        my_account.id = 1;
        my_account.name = "Mary";
        my_account.balance = 6_880_000;

        System.out.println(my_account.name);

        bank_account ba1 = new bank_account();
        ba1.name = "Pasha";

        bank_account ba2 = ba1;

        my_account.AddingFunds(120_000);

        double snyatie = kisa_alisa_account.ReducingFunds(500);

        System.out.println(snyatie);


    }
}