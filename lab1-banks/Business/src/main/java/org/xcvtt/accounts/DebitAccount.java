package org.xcvtt.accounts;

import org.xcvtt.entities.Bank;
import org.xcvtt.entities.Client;

import java.time.LocalDate;

/**
 * Дебетовый аккаунт расширает базовый
 */
public class DebitAccount extends Account {
    public DebitAccount(Client client, Bank bank, int id, LocalDate creationDate, long depositAmount) {
        super(client, bank, id, creationDate);
        setAccountLimits(new DebitAccountLimits(this, depositAmount));
        setBalance(depositAmount);
    }
}