package com.my.pattern.strategy;

public class BookStoreWebProgram extends WebProgram {
    String bookStoreName;

    public BookStoreWebProgram(String bookStoreName,Os os, ProgrammingLanguage programmingLanguage) {
        this.os = os;
        this.bookStoreName = bookStoreName;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void choosePL(ProgrammingLanguage programmingLanguage) {
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void chooseOs(Os os) {
        setOs(os);
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }
    public void open(){
        System.out.println(bookStoreName + "开业啦");
        os.useOs();
        programmingLanguage.useLanguage();
    }
}
