package com.example.edashouse.model.units.npc;

import com.example.edashouse.model.constants.*;
import com.example.edashouse.model.units.NonPlayableCharacters;

import java.util.ArrayList;

public class Pot  extends NonPlayableCharacters {
    ArrayList<Items> items;
    Potions potionResult;
    Items itemResult;

    public Pot() {
        items = new ArrayList<>();
        setImageURL(ImageURL.POT.getURL());
        setCharacter(Characters.POT);
        setCharacterViewCode(Characters.POT);
        setNPCId(NPCIdentity.POT);
    }

    public void addItemToPot(Items item) {
        items.add(item);
    }

    public ArrayList<Items> getItemsPut() {
        return this.items;
    }

    public void clear() {
        items = new ArrayList<>();
    }

    public void setPotionResult(Potions potionResult) {
        this.potionResult = potionResult;
    }

    public void setItemResult(Items itemResult) {
        this.itemResult = itemResult;
    }

    public Items getItemResult() {
        return itemResult;
    }

    public Potions getPotionResult() {
        return potionResult;
    }
}
