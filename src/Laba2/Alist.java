package Laba2;

import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.namespace.QName;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Alist {


    ArrayList<Person> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();

    Person person1 = new Person("Andrew");
    Person person2 = new Person("Sara");


    public void AddArrayList(){
    arrayList.add(person1);
    arrayList.add(person2);

    }
    public void GetArrayList(){

       arrayList.forEach(arrayList -> System.out.println(arrayList));

    }

    public void RemoveArrayList(){
        boolean remove =arrayList.remove(person1);
        System.out.println(remove);
        System.out.println("Size =" + arrayList.size());

    }



}
