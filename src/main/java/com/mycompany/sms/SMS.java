package com.mycompany.sms;

import com.mycompany.sms.view.LoginFrame;
import com.mycompany.sms.view.MainFrame;

public class SMS {

    public static void main(String[] args) {
        //LoginFrame loginFrame = new LoginFrame(); // create MainFrame object
        //loginFrame.setLocationRelativeTo(null); // set open location
        //loginFrame.show(); // show the frame
        MainFrame loginFrame = new MainFrame();
        loginFrame.show();
    }
}
