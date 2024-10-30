package io.codeforall.fanStatics;

import io.codeforall.fanStatics.exceptions.FileNotFoundException;
import io.codeforall.fanStatics.exceptions.NotEnoughPermissionException;
import io.codeforall.fanStatics.exceptions.NotEnoughSpaceException;

public class FileManager {

    public boolean login;
    public boolean logout;
    public File[] file;

    public FileManager(int filelengh) {
        this.login = isLogin();
        this.logout = isLogout();
        file = new File[filelengh];
    }

    public boolean isLogin() {
        return login;
    }

    public boolean isLogout() {
        return logout;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public void setLogout(boolean logout) {
        this.logout = logout;
    }

    public File[] getFile(String newFile) throws FileNotFoundException {
        //File newFiles = new File(newFile);

        //logica
        for (int i = 0; i < file.length; i++) {
            if(file[i].getName() == newFile){
                System.out.println("Exist");
                return file;
            }throw new FileNotFoundException("My File Error Exception");
        }
        return file;
    }

    public void createFile(String newFile) throws NotEnoughPermissionException, NotEnoughSpaceException {
        //File[] listFiles = new File[totalfile];

        //se exitir login -> create file
        //se não not enough permission
        //throw new Exception()
        if (login) {
            for (int i = 0; i < file.length; i++) {
                if(file[i] == null){
                    file[i] = new File(newFile);
                    return;
                } throw new NotEnoughSpaceException("My message new");
            }
            //getFile(newFile);
            return;
        }
        throw new NotEnoughPermissionException("My Enough Permission Exception");

        //getFile(newFile);
    }

}
