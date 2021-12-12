/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.devj120.lab2;

/**
 *
 * @author bezdetk0@mail.ru
 */
public class StringArrayException extends Exception {
    
private static final String DEFAUTL_DESCRIPTION
= "Common error";

public StringArrayException() {
super(DEFAUTL_DESCRIPTION);
}

public StringArrayException(String string) {
super(string);
}

}
