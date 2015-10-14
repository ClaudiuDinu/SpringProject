package com.springinaction.knights;

/**
 * Created by cdinu on 10/13/2015.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
