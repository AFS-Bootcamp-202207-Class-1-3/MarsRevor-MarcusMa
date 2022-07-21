package com.afs.tdd;

import com.afs.tdd.entity.Location;
import com.afs.tdd.entity.MarsRover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class DemoTest {
    @Test
    void should_return_0_1_N_when_executeCommand_given_0_0_N_W() {
//        given
        String command = "W";
        Location initLocation = new Location(0,0,"N");
        String expectedResult = "0 1 N";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());

    }
}
