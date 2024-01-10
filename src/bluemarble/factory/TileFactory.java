package bluemarble.factory;

import bluemarble.entity.tile.SpecialTile;
import bluemarble.ifs.Tile;
import bluemarble.entity.tile.City;
import bluemarble.entity.tile.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TileFactory {
    final private static List<Tile> Tiles = new ArrayList<Tile>();

    final private static GoldenKeyFactory keyFactory = new GoldenKeyFactory();

    static {
        Tiles.addAll(Arrays.asList(
                new SpecialTile("시작"), // City 대체 필요
                new City("타이베이"),
                keyFactory,
                new City("베이징"),
                new City("마닐라"),
                new City("제주도"),
                new City("싱가포르"),
                keyFactory,
                new City("카이로"),
                new City("이스탄불"),
                new SpecialTile("무인도"),

                new City("아테네"),
                keyFactory,
                new City("코펜하겐"),
                new City("스톡홀름"),
                new Vehicle("콩코드여객기"),
                new City("베른"), // 전 취리히
                keyFactory,
                new City("베를린"),
                new City("오타와"), // 전 몬트리올

                new SpecialTile("사회복지기금접수"), // City 대체 필요
                new City("부에노스아이레스"),
                keyFactory,
                new City("상파울루"),
                new City("시드니"),
                new City("부산"),
                new City("하와이"),
                new City("리스본"),
                new Vehicle("퀸엘리자베스호"),
                new City("마드리드"),

                new City("우주여행"), // City 대체 필요
                new City("도쿄"),
                new Vehicle("컬럼비아호"),
                new City("파리"),
                new City("로마"),
                keyFactory,
                new City("런던"),
                new City("뉴욕"),
                new SpecialTile("사회복지기금수령"), // City 대체 필요
                new City("서울")
        ));
    }

    private TileFactory() {}

    public static List<Tile> getTiles() {
        return Tiles;
    }
}
