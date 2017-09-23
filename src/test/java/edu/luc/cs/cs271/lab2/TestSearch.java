package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture DONE 

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f DONE
  @Test
     public void testFindPositionList0() {
         final List<Team> list = makeListFixture(0);
         assertFalse(Search.findTeamPosition(list, "Team 2").isPresent());
     }
 
     @Test
     public void testFindPositionList10s() {
         final List<Team> list = makeListFixture(10);
         assertTrue(Search.findTeamPosition(list, "Team 7").isPresent());
     }
 
     @Test
     public void testFindPositionList10f() {
         final List<Team> list = makeListFixture(10);
         assertFalse(
  
  // TODO: testFindMinFundingArray for several sizes and scenarios DONE
  @Test
     public void testFindMinFundingArray200() {
         final Team[] arr = makeArrayFixture(3);
         final int minFunding = 200;
         assertEquals(Optional.of(2), Search.findTeamMinFunding(arr, minFunding));
     }
 
     @Test
     public void testFindMinFundingArray900() {
         final Team[] arr = makeArrayFixture(3);
         final int minFunding = 900;
         assertEquals(Optional.empty(), Search.findTeamMinFunding(arr, minFunding));
     }
 
     @Test
     public void testFindMinFundingArray400() {
         final Team[] arr = makeArrayFixture(7);
         final int minFunding = 400;
         assertEquals(Optional.of(4), Search.findTeamMinFunding(arr, minFunding));
     }
  

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios DONE
    @Test
     public void testFindMinFundingArrayFast400() {
         final Team[] arr = makeArrayFixture(5);
         final int minFunding = 400;
         assertEquals(Optional.of(4), Search.findTeamMinFundingFast(arr, minFunding));
     }
 
     @Test
     public void testFindMinFundingArrayFast700() {
         final Team[] arr = makeArrayFixture(2);
         final int minFunding = 700;
         assertEquals(Optional.empty(), Search.findTeamMinFundingFast(arr, minFunding));
     }
 
     @Test
     public void testFindMinFundingArrayFast100() {
         final Team[] arr = makeArrayFixture(3);
         final int minFunding = 100;
         assertEquals(Optional.of(1), Search.findTeamMinFundingFast(arr, minFunding));
     }