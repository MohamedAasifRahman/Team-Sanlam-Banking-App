package com.mycompany.transaction;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Boitumelo Nicole
 */
public class Transaction {
    
    public enum Type{
        DEPOSIT, WITHDRAWAL
    }
    
    private final Type type;
    private final double amount;
    private final double balanceAfter;
    private final LocalDateTime timestamp;
    
    public Transaction(Type type, double amount, double balanceAfter){
        this.type= type;
        this.amount= amount;
        this.balanceAfter= balanceAfter;
        this.timestamp= LocalDateTime.now();
        
    }
    public Type getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public double getBalanceAfter(){
        return balanceAfter;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    @Override
    public String toString(){
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm");
        return "["+ timestamp.format(dtf)+"]"+type+"R"+ String.format("%.2f", amount)+"Balance:R"+ String.format("%.2f",balanceAfter);
    }
   
}
