//
// Created by louis on 3/19/2026.
//

#include <iostream>
#include <string>
#include <vector>

class Account {
private:
    std::string ownerName;
    double balance;
public:
    Account(std::string name, double initialBalance) {
        ownerName = name;
        balance = initialBalance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount > balance) {
            std::cout << "Insufficient funds. Withdrawal cancelled." << std::endl;
        } else {
            balance -= amount;
        }
    }
    double getBalance() {
        return balance;
    }

    std::string getOwnerName() {
        return ownerName;
    }
};

int main() {
    std::vector<Account> accounts;
    Account account1("John Doe", 1000);
    Account account2("Jane Smith", 2000);

    accounts.push_back(account1);
    accounts.push_back(account2);

    accounts[0].deposit(500);
    accounts[1].withdraw(1500);
    accounts[0].withdraw(2200);

    std::cout << "Final Balances:" << std::endl;
    std::cout << accounts[0].getOwnerName() << ": $" << accounts[0].getBalance() <<
    std::endl;

    std::cout << accounts[1].getOwnerName() << ": $" << accounts[1].getBalance() <<
    std::endl;

    return 0;
}
