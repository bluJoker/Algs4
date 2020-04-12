package coreJava.chapter_5.E_5_4;

public abstract class Person {
    public abstract String getDescription();
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
