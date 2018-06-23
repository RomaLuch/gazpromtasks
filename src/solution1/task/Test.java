package solution1.task;

import solution1.FirstLevel;
import solution1.ForthLevel;
import solution1.SecondLevel;
import solution1.ThirdLevel;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ForthLevel forthLevel = new ForthLevel();
        Map<ThirdLevel, SecondLevel> forthLevelData = forthLevel.getBenfAndCatToCtx();
        ThirdLevel thirdLevel = new ThirdLevel();
        SecondLevel secondLevel = forthLevelData.get(thirdLevel);
        List<FirstLevel> secondLevelData = secondLevel.getSecondLevelData();
        FirstLevel firstLevel = secondLevelData.get(0);
        Map<String, String> firstLevelData = firstLevel.getFirstLevelData();
    }
}
