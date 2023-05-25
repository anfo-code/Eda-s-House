package com.example.edashouse.model.units;

import com.example.edashouse.model.constants.*;
import com.example.edashouse.model.potions.Potion;

public class Witch {
    //Coordinates will be having 2 values, X and Y coordinates accordingly
    private int[] coordinates;
    private String imagePath;
    private Characters characterCode;
    private ActionsConstants lastAction;
    private Items itemHeld;
    private Potion potionHeld;

    public Witch(int[] coordinates) {
        imagePath = ImageURL.WITCH_FRONT.getURL();
        characterCode = Characters.WITCH;
        this.coordinates = coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public void setImage(ActionsConstants direction) {
        switch (direction) {
            case LEFT_KEY_PRESSED -> imagePath = ImageURL.WITCH_LEFT.getURL();
            case RIGHT_KEY_PRESSED -> imagePath = ImageURL.WITCH_RIGHT.getURL();
            case UP_KEY_PRESSED -> imagePath = ImageURL.WITCH_BACK.getURL();
            case DOWN_KEY_PRESSED -> imagePath = ImageURL.WITCH_FRONT.getURL();
        }
    }

    public void setLastAction(ActionsConstants action) {
        this.lastAction = action;
    }

    public void setItemHeld(Items item) {
        this.itemHeld = item;
    }

    public void setPotionHeld(Potion potion) {
        this.potionHeld = potion;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public Characters getCharacterCode() {
        return characterCode;
    }

    public String getImagePath() {
        return imagePath;
    }

    public ActionsConstants getLastAction() {
        return lastAction;
    }

    public Items getItemHeld() {
        return this.itemHeld;
    }

    public Potion getPotionHeld() {
        return this.potionHeld;
    }
}
