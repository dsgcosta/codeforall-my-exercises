package io.codeforall.fanStatics.exceptions;

public class NotEnoughPermissionException extends FileException{


    public NotEnoughPermissionException(String myMessage) {
        super(myMessage);
    }

    //  private String message;
    @Override
    public String getMessage() {
      //  System.out.println("Error");
       // this.message = "test";
        return super.getMessage();
    }
}
