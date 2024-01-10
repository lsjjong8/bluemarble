package bluemarble.factory;

import bluemarble.entity.goldenkey.Income;
import bluemarble.entity.goldenkey.Movement;
import bluemarble.entity.goldenkey.Spending;
import bluemarble.ifs.GoldenKey;
import bluemarble.ifs.Tile;

import java.util.*;

public class GoldenKeyFactory extends Tile {

    private Set<GoldenKey> keySet = new HashSet<GoldenKey>();

    public GoldenKeyFactory() {
        super.name = "황금열쇠";
        initGoldenKey();
    }

    public GoldenKey getGoldenKey() {
        GoldenKey ret = null;

        if(keySet.isEmpty()) {
            initGoldenKey();
        }

        // 랜덤 인덱스 생성
        int randomIndex = new Random().nextInt(keySet.size());

        // Iterator를 이용하여 랜덤 인덱스까지 이동
        Iterator<GoldenKey> iterator = keySet.iterator();
        for (int i = 0; i < randomIndex; i++) {
            ret = iterator.next();
        }
        // 해당 위치의 원소를 삭제
        iterator.remove();

        return ret;
    }

    private void initGoldenKey() {
        keySet.addAll(Arrays.asList(
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Movement(),
                new Income(),
                new Income(),
                new Income(),
                new Income(),
                new Income(),
                new Income(),
                new Income(),
                new Spending(),
                new Spending(),
                new Spending(),
                new Spending(),
                new Spending(),
                new Spending()
        ));
    }
}
