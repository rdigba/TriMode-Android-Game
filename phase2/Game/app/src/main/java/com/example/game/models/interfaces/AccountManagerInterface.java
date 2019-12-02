package com.example.game.models.interfaces;

import com.example.game.models.Account;

import java.io.File;

/**
 * Interface for an account manager.
 */
public interface AccountManagerInterface {
    abstract void createNewAccount(String login, File contextFile);

    abstract Account openExistingAccount(String login, File contextFile);
}