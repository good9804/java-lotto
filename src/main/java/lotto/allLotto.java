package lotto;


import java.util.*;

public class allLotto {
    private  List<List<Integer>> lottos;

    public allLotto(){

        this.lottos = new ArrayList<>();
    }

    public void addLotto(Lotto lotto){
        this.lottos.add(lotto.getLottoNumber());}

    public int sizeLotto(){
        return this.lottos.size();
    }
    public Set<Integer> transformSet(List<Integer> lotto){

        Set<Integer> transformLotto= new HashSet<>(lotto);
        return transformLotto;
    }
    public List<Integer> get(int index){
        return this.lottos.get(index);
    }

    public void printAllLotto(){
        for(int i=0;i<lottos.size();i++){
            System.out.println(lottos.get(i));
        }
    }

}
