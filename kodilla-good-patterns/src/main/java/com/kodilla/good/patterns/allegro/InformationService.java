package com.kodilla.good.patterns.allegro;

public class InformationService {

    public void sendMessage (User user) {
        System.out.println(user.getUserName() + " Thank You for order. \nHave a nice day! \nTeam Store");
    }
}
