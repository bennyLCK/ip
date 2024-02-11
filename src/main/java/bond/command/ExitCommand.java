package bond.command;

import bond.main.Storage;
import bond.main.Ui;
import bond.task.TaskList;

/**
 * The ExitCommand class is used to encapsulate a exit command, which is
 * executed upon invoking the execute() method.
 *
 * @author Benny Loh
 * @version 0.1
 */
public class ExitCommand extends Command {

    /**
     * Constructor for the ExitCommand class.
     */
    public ExitCommand() {
        super("bye");
        super.setExit();
    }

    /**
     * Executes the exit command.
     * Displays the goodbye message and closes scanner for user input.
     *
     * @param tasks   The list of tasks.
     * @param ui      The user interface.
     * @param storage The storage.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        String response = ui.showGoodbye();
        ui.closeScanner();
        return response;
    }
}
