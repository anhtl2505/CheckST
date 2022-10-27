package Scenario;

import org.junit.Test;
import page.checkFunction;

public class todo_Scenario {
    @Test
    public void verifyRequiredFlow() {
        checkFunction CF = new checkFunction();

        //1. Login using your github account.
        CF.SignIn();
        //2. create 10 to do list with random strings
        CF.AddListTodo();
        //3. upon completion log out.
        CF.SignOut();
        //4. Login again with the same account.
        CF.SignIn();
        //5. Delete your list from 5 - 10.
        CF.RemoveTodoList();
        //6. Logout upon completion
        CF.SignOut();
    }
}
