package com.example.edashouse.model.units.npc;

import com.example.edashouse.model.constants.Characters;
import com.example.edashouse.model.constants.ImageURL;
import com.example.edashouse.model.units.NonPlayableCharacters;

public class Windowsill extends NonPlayableCharacters {
    public Windowsill() {
        setImageURL(ImageURL.WINDOWSILL.getURL());
        setCharacterCode(Characters.WINDOWSILL);
        setCharacterViewCode(Characters.WINDOWSILL);
    }
}
