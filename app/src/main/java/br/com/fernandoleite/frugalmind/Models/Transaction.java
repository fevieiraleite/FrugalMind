package br.com.fernandoleite.frugalmind.Models;

import java.util.Date;

/**
 * Created by Fernando Leite on 10/30/2017.
 */

public class Transaction {
    private int amount;
    private int accountId;
    private int categoryId;
    private Date date;
    private boolean isRecurring;
    private int recurringDays;
}
