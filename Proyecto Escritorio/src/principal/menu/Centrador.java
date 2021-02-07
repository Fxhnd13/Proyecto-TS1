/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal.menu;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Jose Soberanis
 */
public class Centrador {

    public static void center(Component c){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = c.getSize();

        if (frameSize.height > screenSize.height) {
        frameSize.height = screenSize.height;
        }

        if (frameSize.width > screenSize.width) {
        frameSize.width = screenSize.width;
        }
        c.setLocation( ( screenSize.width - frameSize.width ) / 2,
        ( screenSize.height - frameSize.height) / 2 );
    }
}
