package com.globant.locators;

public class FacebookLocator {
    //Por cuestiones del taller daré los valores donde declaró las variables.
    // Ya se que no es buena pratica hacerlo así, se deberia dar el valor en el constructor.
    // Vale aclarar que todos los string son locator Bycss
    private String LogInButton = "._6ltg button";
    private String ArrowMenu = "div[role='banner'] div:nth-child(4) div[aria-label*='Controles']>span>div";
    private String LogOutButton = ".b20td4e0 div:nth-child(4)";
    private String MyProfile = "div[role='dialog']>div>div>div>div>div>div>div>div>div>div>a";
    private String MyFriends = "a[aria-label='Facebook']";
}
