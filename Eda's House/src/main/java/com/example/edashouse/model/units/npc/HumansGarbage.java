package com.example.edashouse.model.units.npc;

import com.example.edashouse.model.constants.BasicCoordinates;
import com.example.edashouse.model.constants.Characters;
import com.example.edashouse.model.constants.ImageURL;
import com.example.edashouse.model.units.NonPlayableCharacters;

public class HumansGarbage extends NonPlayableCharacters {
    public HumansGarbage() {
        setCoordinates(BasicCoordinates.HUMANS_GARBAGE.getCoordinates());
        setImageURL(ImageURL.HUMANS_GARBAGE.getURL());
        setCharacterCode(Characters.HUMANS_GARBAGE);
    }
}