package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import  lotto.makeNumber.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class allLottoTest {
    @DisplayName("로또번호목록 add 테스트")
    @Test
    void addLotto(){
        allLotto alllotto= new allLotto();
        List<Integer> number=new ArrayList<>();
        number=makeNumber.randomLotto(number);
        alllotto.addLotto(number);
        assertThat(alllotto.sizeLotto()==1);
    }
    @DisplayName("로또번호목록 출력 테스트")
    @Test
    void printAllLotto(){
        allLotto alllotto= new allLotto();
        List<Integer> number=new ArrayList<>();
        number=makeNumber.randomLotto(number);
        alllotto.addLotto(number);
        alllotto.printAllLotto();
    }


}