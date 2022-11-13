package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomUniqueNumbersInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

class RankTest {
    @DisplayName("랭크 getRank메소드 테스트")
    @Test
    void getRank2_Test(){
        int count=5;
        Rank rank=Rank.getRank(5,true);
        assertThat(rank==Rank.SECOND);
    }
    @DisplayName("랭크 getRank메소드 테스트")
    @Test
    void getRank3_Test(){
        int count=5;
        Rank rank=Rank.getRank(5,false);
        assertThat(rank==Rank.THIRD);
    }
    @DisplayName("랭크 getRank메소드 테스트")
    @Test
    void getRank4_Test(){
        int count=5;
        Rank rank=Rank.getRank(5,false);
        assertThat(rank==Rank.FOURTH);
    }
    @DisplayName("랭크 getRank메소드 테스트")
    @Test
    void getRankLOST_Test(){
        int count=5;
        Rank rank=Rank.getRank(0,false);
        assertThat(rank==Rank.LOST);
    }

}