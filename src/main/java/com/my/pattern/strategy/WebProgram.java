package com.my.pattern.strategy;

/**
 * web程序类
 */
public abstract class WebProgram {
    Os os;
    ProgrammingLanguage programmingLanguage;

    public abstract void choosePL(ProgrammingLanguage programmingLanguage);
    public abstract void chooseOs(Os os);

    public void setOs(Os os) {
        this.os = os;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
