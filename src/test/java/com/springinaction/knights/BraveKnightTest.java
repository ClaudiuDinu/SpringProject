package com.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by cdinu on 10/13/2015.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
