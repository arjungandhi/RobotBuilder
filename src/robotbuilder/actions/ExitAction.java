/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robotbuilder.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import robotbuilder.ActionsClass;

/**
 *
 * @author brad
 */
public class ExitAction extends AbstractAction {
    ActionsClass exitAction;

    public ExitAction() {
        putValue(Action.NAME, "Exit");
        putValue(Action.SHORT_DESCRIPTION, "Exit the application");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
}
