package com.example.edashouse.controller;

import com.example.edashouse.view.Layout;
import com.example.edashouse.view.NonPlayableCharactersActivator;
import javafx.application.Application;
import javafx.stage.Stage;

public class GameController extends Application {
    //TODO    Посилання на ідеальний референс https://github.com/smowgli/space-runner-game-javafx/blob/main/src/view/GameViewManager.java
    //TODO    Поставити Статичні об'єкти на поле
    //TODO    Ввести зміни щодо можливості руху героя (неможна рухатися через об'єкти)
    //TODO    Add interactions with objects
    //TODO    Do refactoring, especially related to CVM

    private Layout layout;

    @Override
    public void start(Stage stage) throws Exception {
        layout = new Layout(stage);
        layout.addWitch();
        activateNPCharacters(layout);
        SceneListenersSetter scene = new SceneListenersSetter(layout.getScene(), layout);
    }

    public void activateNPCharacters(Layout layout) {
        new NonPlayableCharactersActivator(layout);
    }
}
