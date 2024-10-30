package io.codeforall.fanStatics;

import io.codeforall.fanStatics.exceptions.NotEnoughPermissionException;
import io.codeforall.fanStatics.exceptions.NotEnoughSpaceException;

public class Main {
    public static void main(String[] args) {

        //Try Catch terá que ser implementado aqui

        FileManager fileTest = new FileManager(2);

        System.out.println(fileTest.isLogin());

        //File newFile = new File();

        //newFile.setName("File1");

        //System.out.println(newFile.getName());

        try {
            fileTest.createFile("NewFile");
        }catch (NotEnoughPermissionException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughSpaceException ex){
            System.out.println(ex.getMessage());
        }

        fileTest.setLogin(true);

        System.out.println(fileTest.isLogin());

        try {
            fileTest.createFile("NewFile");
        }catch (NotEnoughPermissionException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughSpaceException ex){
            System.out.println(ex.getMessage());
        }

    }
}
