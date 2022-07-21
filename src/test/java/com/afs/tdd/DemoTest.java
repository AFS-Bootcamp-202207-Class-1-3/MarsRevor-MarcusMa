package com.afs.tdd;

import com.afs.tdd.entity.Location;
import com.afs.tdd.entity.MarsRover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class DemoTest {
    @Test
    void should_return_0_1_N_when_executeCommand_given_0_0_N_M() {
//        given
        String command = "M";
        Location initLocation = new Location(0,0,"N");
        String expectedResult = "0 1 N";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());

    }
    @Test
    void should_return_0_0_W_when_executeCommand_given_0_0_N_L() {
//        given
        String command = "L";
        Location initLocation = new Location(0,0,"N");
        String expectedResult = "0 0 W";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());

    }
    @Test
    void should_return_0_0_E_when_executeCommand_given_0_0_N_R() {
//        given
        String command = "R";
        Location initLocation = new Location(0,0,"N");
        String expectedResult = "0 0 E";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_negative1_S_when_executeCommand_given_0_0_S_M() {
//        given
        String command = "M";
        Location initLocation = new Location(0,0,"S");
        String expectedResult = "0 -1 S";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_E_when_executeCommand_given_0_0_S_L() {
//        given
        String command = "L";
        Location initLocation = new Location(0,0,"S");
        String expectedResult = "0 0 E";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_W_when_executeCommand_given_0_0_S_R() {
//        given
        String command = "R";
        Location initLocation = new Location(0,0,"S");
        String expectedResult = "0 0 W";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_1_0_E_when_executeCommand_given_0_0_E_M() {
//        given
        String command = "M";
        Location initLocation = new Location(0,0,"E");
        String expectedResult = "1 0 E";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_N_when_executeCommand_given_0_0_E_L() {
//        given
        String command = "L";
        Location initLocation = new Location(0,0,"E");
        String expectedResult = "0 0 N";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_S_when_executeCommand_given_0_0_E_R() {
//        given
        String command = "R";
        Location initLocation = new Location(0,0,"E");
        String expectedResult = "0 0 S";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_even1_0_W_when_executeCommand_given_0_0_W_M() {
//        given
        String command = "M";
        Location initLocation = new Location(0,0,"W");
        String expectedResult = "-1 0 W";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_S_when_executeCommand_given_0_0_W_L() {
//        given
        String command = "L";
        Location initLocation = new Location(0,0,"W");
        String expectedResult = "0 0 S";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_0_0_N_when_executeCommand_given_0_0_W_R() {
//        given
        String command = "R";
        Location initLocation = new Location(0,0,"W");
        String expectedResult = "0 0 N";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
    @Test
    void should_return_2_0_N_when_executeCommand_given_0_0_N_Command() {
//        given
        String command = "MRMLMLMR";
        Location initLocation = new Location(0,0,"N");
        String expectedResult = "2 0 N";
//        when
        MarsRover marsRover = new MarsRover(initLocation);
        marsRover.executeCommand(command);
//        then
        Assertions.assertEquals(expectedResult,marsRover.getLocation().toString());
    }
}
