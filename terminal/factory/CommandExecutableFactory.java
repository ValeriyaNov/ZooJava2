package terminal.factory;

import terminal.command.Command;
import terminal.command.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
    }
