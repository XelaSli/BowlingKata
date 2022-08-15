package com.sahli.bowling;

import org.junit.Assert;
import org.junit.Test;

class GameTest {
    Game game = new Game();

    @Test
    public void all_failed_should_return_0(){
        Assert.assertEquals(game.getFinalScore("--------------------"),0);

    }


}